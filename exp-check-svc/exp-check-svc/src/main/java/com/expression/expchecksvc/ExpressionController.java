package com.expression.expchecksvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/expression")
public class ExpressionController {
    @Autowired
    ExpressionService service;
    @GetMapping("/check/{input}")
    public ResponseEntity<?> checkValidExpression(@PathVariable("input") String input){
        return ResponseEntity.of(Optional.of(service.longestValidParentheses(input)));
    }
}
