package com.dialect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DialectController {

    @GetMapping("/dialect")
    public String getDialect(Model model) {

        // model.addAttribute(null, "");

        return "test-dialect";
    }
}
