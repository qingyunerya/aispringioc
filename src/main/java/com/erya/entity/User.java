package com.erya.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
//@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private int age;
    private List<Address>  addresses;
    private List<String> strings;
    private Map<String,Object> map;
    public User(){
        System.out.println("创建了user");
    }
}
