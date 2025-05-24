package com.example.EmployeePayrollApp.controller;

import com.example.EmployeePayrollApp.dto.EmployeePayrollDTO;
import com.example.EmployeePayrollApp.model.EmployeePayroll;
import com.example.EmployeePayrollApp.service.IEmployeePayrollService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService service;

    @GetMapping("/")
    public ResponseEntity<List<EmployeePayroll>> getAll()
    {
        log.info("Fetching all employees");
        List<EmployeePayroll> employees = service.getAllEmployee();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<EmployeePayroll> create(@Valid @RequestBody EmployeePayrollDTO dto)
    {
        log.info("Creating employee with data: {}",dto);
        EmployeePayroll employee = service.createEmployee(dto);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeePayroll> update(@PathVariable int id, @Valid @RequestBody EmployeePayrollDTO dto)
    {
        log.info("Updating employee with id: {} and data: {}",id,dto);
        EmployeePayroll updatedEmployee = service.updateEmployee(id, dto);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable int id)
    {
        log.info("Deleting employee with id: {}",id);
        service.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
