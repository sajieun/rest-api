package com.example.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Data를 통해 자동으로 toString,getter,setter...등 생성된다.
@Data
@AllArgsConstructor // 전체 4개의 파라미터를 받는 메소드 생성
@NoArgsConstructor // 기본 생성자 까지도 만들어준다.
public class BookQueryParam {
    private String catagory;
    private String issuedYear;
    private String issuedMonth;
    private String issuedDay;
}
