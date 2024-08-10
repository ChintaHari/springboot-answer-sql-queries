package com.example.springboot_answer_sql_queries.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_answer_sql_queries.RequestAndResponse.SqlRequest;
import com.example.springboot_answer_sql_queries.RequestAndResponse.SqlResponse;
import com.example.springboot_answer_sql_queries.service.SqlService;

@RestController
public class SqlController {

    @Autowired
    private SqlService sqlService;
   
    @PostMapping(path="/sql", consumes="application/json", produces="application/json")
    public SqlResponse sql(@RequestBody SqlRequest sqlRequest) throws IOException {
        return sqlService.answerSqlQueries(sqlRequest);
    }
    
}
