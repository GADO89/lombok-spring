package com.spring.lombok.model;
//change repository name

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Student {

    private Long id;
    private String name;
    private String address;
    private String age;

    /*@Override
    public String toString() {
        return "ID ="+id+" name ="+name+" address ="+address+" age ="+age;
    }*/
}
