package com.java.practice.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@lombok.Builder
public class EmployeeDto {

    private int id;
    private String name;
    private Long age;

    public EmployeeDto(String name, long age) {
        this.name = name;
        this.age = age;
    }
}
