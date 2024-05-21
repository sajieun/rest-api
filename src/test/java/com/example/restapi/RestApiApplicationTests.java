package com.example.restapi;

import com.example.restapi.model.UserRequestParam;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiApplicationTests {

	@Autowired
	private ObjectMapper objectMapper;
	@Test
	void contextLoads() throws JsonProcessingException {
		var user = new UserRequestParam();
		user.setUserName("jieun");
		user.setUserAge(10);
		user.setEmail("sajieun721@naver.com");
		user.setIsKorean(true);

		var json = objectMapper.writeValueAsString(user);
		System.out.println(json);

		var dto = objectMapper.readValue(json, UserRequestParam.class);
		System.out.println(dto);
	}

}
