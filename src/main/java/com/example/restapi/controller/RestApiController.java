package com.example.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping(path = "/hello")
    public String hello(){
        var html = "<html> <body> <h1> Hello String Boot </h1> </body> </html>";
        return html;
    }

    //http://localhost:8080/api/echo/안녕하세요/number/12/is-man/false
    @GetMapping(path = "/echo/{message}/number/{number}/is-man/{isMan}")
    public String echo(
            @PathVariable String message, // 만약 이름을 갖게 하고 싶지 않으면
            @PathVariable int number,
            @PathVariable boolean isMan
//          @PathVariable(name = "message") String msg 이렇게 설정해 주면 된다.
    ){
        System.out.println("echo message : "+message + number + isMan);
        // 대문자로 변환해서 RETURN
        return message.toUpperCase()+number+isMan;
    }
}
