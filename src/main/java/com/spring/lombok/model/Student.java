package com.spring.lombok.model;
//change repository name

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    private Long id;
    private String name;
    private String address;
    private String age;



}
