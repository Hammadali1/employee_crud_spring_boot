package com.java.practice.crud.utils;

import com.java.practice.crud.dto.EmployeeDto;
import com.java.practice.crud.model.Employee;
import com.java.practice.crud.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Component
public class StartUpOperation implements CommandLineRunner {

    Logger log = Logger.getLogger(StartUpOperation.class.getName());

    @Autowired
    private EmployeeService employeeService;

    @Override
    public void run(String... args) throws Exception {

        log.info("StartUp Operation started.");

        List<EmployeeDto> employeeDtos = new ArrayList<>();
        employeeDtos.add(new EmployeeDto("Hammad",28L));
        employeeDtos.add(new EmployeeDto("John",24));
        employeeDtos.add(new EmployeeDto("Sami",26));

        employeeDtos.forEach(employeeDto -> employeeService.saveEmployee(employeeDto));

        log.info("StartUp Operation Completed Successfully.");
    }
}
