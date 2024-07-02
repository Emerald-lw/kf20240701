package org.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 接口类
 */

@RestController
@RequestMapping
public class GitController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
