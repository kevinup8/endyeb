package com.xxxx.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: OriginalCoder
 * @Date: 2021/2/4 14:55
 * @Description: 测试
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/employee/basic/hello")
    public String hell02() {
        return "/employee/basic/hello";
    }

    @GetMapping("/employee/advanced/hello")
    public String hell03() {
        return "/employee/advanced/hello";
    }
}
