package com.example.restapi.controller;

import com.example.restapi.model.UserRequestParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j //로그백 관련된 어노테이션
@RestController
@RequestMapping("/api")
public class PutApiController {
    @PutMapping("/put")
    public void put(
            @RequestBody
            UserRequestParam userRequestParam
            ){
        log.info("Request : {}", userRequestParam);
        //Request : UserRequestParam(userName=spring boot, userAge=10, email=sajieun000721, isKorean=false)
        // toString 형태로 들어가짐
    }

}
