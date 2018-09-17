package com.maileke.blog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * shieason 2018.09.17
 */

@Slf4j
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        log.info("This is first page......................................");
        return "index";
    }

}