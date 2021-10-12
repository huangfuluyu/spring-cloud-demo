package com.didispace.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : HuangFu
 * @Description : HelloController
 * @date : 2021-10-12 16:08
 **/
@RestController
public class HelloController {
    @RequestMapping("/index")
    public String index(){
        return "hello world";
    }
}
