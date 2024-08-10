package com.example.springboot_answer_sql_queries.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SqlGenerationExceptionHandler {
    
    @ExceptionHandler(SqlGenerationException.class)
    public ResponseEntity<String> handleSqlGenerationException(SqlGenerationException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
}
