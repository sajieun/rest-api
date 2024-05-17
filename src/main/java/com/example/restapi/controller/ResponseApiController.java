package com.example.restapi.controller;

import com.example.restapi.model.UserRequestParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/api/v1")
public class ResponseApiController {

// http://localhost:8080/api/v1
    @GetMapping("")
//    @RequestMapping(path = "", method = RequestMethod.GET)
    @ResponseBody
    public  ResponseEntity user(){
        var user = new UserRequestParam();
        user.setUserName("jieun");
        user.setUserAge(25);
        user.setEmail("sajieun000721");

        log.info("user: {}",user);

        var response = ResponseEntity
                .status(HttpStatus.CREATED)
                .header("x-custom","hi")
                .body(user);

      return response;
    }
}
