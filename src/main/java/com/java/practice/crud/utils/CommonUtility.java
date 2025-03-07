package com.java.practice.crud.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.practice.crud.dto.EmployeeDto;
import com.java.practice.crud.model.Employee;

public class CommonUtility {

   static ObjectMapper objectMapper = new ObjectMapper();

   public static EmployeeDto entityToDto(Employee employee) {
       return objectMapper.convertValue(employee,EmployeeDto.class);
   }

   public static Employee dtoToEntity(EmployeeDto employeeDto) {
        return objectMapper.convertValue(employeeDto,Employee.class);
    }
}
