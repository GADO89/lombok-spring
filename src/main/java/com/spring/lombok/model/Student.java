package com.spring.lombok.model;
//change repository name

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Student {

    private Long id;
    private String name;
    private String address;
    private String age;

   /* @Override
    public boolean equals(Object obj) {
        if (this==obj)return true;
        if (obj==null)return false;
        if (this.getClass()!=this.getClass())return false;
        Student student=(Student) obj;
        return this.id== student.getId() && this.getName()==student.getName()
                && this.getAddress() ==student.getAddress() && this.getAge()== student.age;
    }

    @Override
    public int hashCode() {
        return (int) (id * name.hashCode() * address.hashCode() * age.hashCode());
    }*/

    /*@Override
    public String toString() {
        return "ID ="+id+" name ="+name+" address ="+address+" age ="+age;
    }*/
}
