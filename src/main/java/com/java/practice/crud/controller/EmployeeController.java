package com.java.practice.crud.controller;

import com.java.practice.crud.dto.EmployeeDto;
import com.java.practice.crud.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/{id}")
    public EmployeeDto getEmployee(@PathVariable String id){
         return employeeService.getEmployee(Integer.valueOf(id));
    }

    @GetMapping("/employee")
    public List<EmployeeDto> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping("/employee")
    public EmployeeDto saveEmployee(@RequestBody EmployeeDto employee){
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/employee")
    public EmployeeDto updateEmployee(@RequestParam String id, @RequestBody EmployeeDto employee){
        return employeeService.updateEmployee(Integer.valueOf(id),employee);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable String id){
        return employeeService.deleteEmployee(Integer.valueOf(id));
    }
}
