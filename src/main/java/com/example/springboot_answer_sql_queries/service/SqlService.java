package com.example.springboot_answer_sql_queries.service;

import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.springboot_answer_sql_queries.RequestAndResponse.SqlRequest;
import com.example.springboot_answer_sql_queries.RequestAndResponse.SqlResponse;
import com.example.springboot_answer_sql_queries.exception.SqlGenerationException;

@Service
public class SqlService {
    @Value("classpath:/schema.sql")
    private Resource ddlResource;

    @Value("classpath:/sql-prompt-template.st")
    private Resource sqlPromptTemplateResource;

    private ChatClient aiClient;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public SqlService(ChatClient.Builder aiClientBuilder) {
        this.aiClient = aiClientBuilder.build();
    }

    public SqlResponse answerSqlQueries(SqlRequest sqlRequest) throws IOException {
        String schema = ddlResource.getContentAsString(Charset.defaultCharset());

        String query = aiClient.prompt()
            .user(userSpec -> userSpec
                .text(sqlPromptTemplateResource)
                .param("question", sqlRequest.question())
                .param("ddl", schema)
                )
            .call()
            .content();

        if (query.toLowerCase().startsWith("select")) 
            return new SqlResponse(query, jdbcTemplate.queryForList(query));

        throw new SqlGenerationException(query);
    }
    
}
