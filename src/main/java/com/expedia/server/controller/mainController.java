package com.expedia.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    @RequestMapping("/student")
    public String home()
    {
        System.out.println("hello");
        return "deshwal nahi ho paega tujhse";
    }

}
