package com.erya.entity;

import lombok.Data;

@Data
public class Person {
    private Long id;
    private String name;
    private Car car;
}
