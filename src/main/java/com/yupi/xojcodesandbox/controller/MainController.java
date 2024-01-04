package com.yupi.xojcodesandbox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : SuperXCR
 * @Create 2024-01-03
 */
@RestController("/")
public class MainController {
    @GetMapping("/health")
    public String healthCheck() {
        return "ok";
    }
}
