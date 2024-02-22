package com.example.GitTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/main")
    public String main(){
        System.out.println("집에서 수정함");
        return "main";
    }
}
