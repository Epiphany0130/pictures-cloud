package com.guyuqi.picturescloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GuYuqi
 * @version 1.0
 */
@RequestMapping()
@RestController
public class testController {
    @GetMapping()
    public String test() {
        return "Hello";
    }
}
