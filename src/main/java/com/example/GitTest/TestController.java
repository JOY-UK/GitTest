package com.example.GitTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/main")
    public String main(){
        System.out.println("집에서 수정함");
        System.out.println("이 코드는 dev branch 에서 추가됨");
        return "main";
    }
}
