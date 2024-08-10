package com.example.springboot_answer_sql_queries.RequestAndResponse;

import java.util.List;
import java.util.Map;

public record SqlResponse(String sqlQuery, List<Map<String, Object>> results) {
    
}
