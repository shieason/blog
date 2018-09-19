package com.maileke.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * shieason 2018.09.17
 * index
 */
@Slf4j
@Controller
@Api(tags = "首页控制台api")
public class IndexController {

    @ApiOperation(value = "首页访问地址")
    @GetMapping("/")
    public String index() {
        log.info("This is first page......................................");
        return "index";
    }

}