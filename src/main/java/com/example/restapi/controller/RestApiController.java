package com.example.restapi.controller;

import com.example.restapi.model.BookQueryParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping(path = "/hello")
    public String hello(){
        var html = "<html> <body> <h1> Hello String Boot </h1> </body> </html>";
        return html;
    }

    //http://localhost:8080/api/echo/hello/number/12/is-man/false
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

//    http://localhost:8080/api/book?catagory=IT&issuedYear=2023&issued-month=01&issued_day=31
    @GetMapping(path = "/book")
    public void queryParam(
            @RequestParam String catagory,
            @RequestParam String issuedYear,
            @RequestParam(name = "issued-month") String issuedmonth,
            @RequestParam String issued_day
    ){
        System.out.println(catagory);
        System.out.println(issuedYear);
        System.out.println(issuedmonth);
        System.out.println(issued_day);
    }

//    객체를 통해 파싱
//    http://localhost:8080/api/book2?catagory=IT&issuedYear=2023&issuedMonth=01&issuedDay=31 이렇게 하면 - _ 있는 애들이 안 읽혀짐
//    자바 규칙에 맞게 http://localhost:8080/api/book2?catagory=IT&issuedYear=2023&issuedMonth=01&issuedDay=31 이렇게 설정
    @GetMapping(path = "/book2")
    public void queryParamDto(
            BookQueryParam bookQueryParam
    ){
        System.out.println(bookQueryParam);
    }

    // 파라미터 2가지 int형태로 받아서 곱셈, 덧셈 하기
    @GetMapping(path = "math/num1/{num1}/num2/{num2}")
    public String math(
            @PathVariable int num1,
            @PathVariable int num2

    ){
        var sum = num1 + num2;
        var product = num1 * num2;
        System.out.println("덧셈 :" + sum);
        System.out.println("곱셈 :" + product);
        var total = "덧셈 : " + sum + " 곱셈은 : " + product;
        return total;
    }


}
