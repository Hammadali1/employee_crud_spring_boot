package com.java.practice.crud.services;

import com.java.practice.crud.dto.EmployeeDto;
import com.java.practice.crud.model.Employee;
import com.java.practice.crud.repositories.EmployeeRepository;
import com.java.practice.crud.utils.CommonUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeDto getEmployee(Integer id) {
       return employeeRepository.findById(id).map(CommonUtility::entityToDto).orElse(null);
    }

    public List<EmployeeDto> getAllEmployee() {
        return employeeRepository.findAll().stream().map(CommonUtility::entityToDto).toList();
    }

    public EmployeeDto saveEmployee(EmployeeDto employee) {
        return CommonUtility.entityToDto(employeeRepository.save(CommonUtility.dtoToEntity(employee)));
    }

    public EmployeeDto updateEmployee(Integer id, EmployeeDto employee) {
        Employee employee1 = employeeRepository.findById(id).get();
        employee1.setName(employee.getName());
        employee1.setAge(employee.getAge());
        return CommonUtility.entityToDto(employeeRepository.save(employee1));
    }

    public String deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
        return "success";
    }
}
