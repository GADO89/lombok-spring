package com.spring.lombok.model;
//change repository name

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

    private Long id;
    private String name;
    private String address;
    private String age;


}
