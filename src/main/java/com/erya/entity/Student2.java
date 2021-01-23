package com.erya.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
//@NoArgsConstructor
public class Student2 {
    private long id;
    private String name;
    private int age;
    private Address address;

    public Student2(){
        System.out.println("创建了student、");
    }
}
