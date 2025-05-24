package com.example.EmployeePayrollApp.service;

import com.example.EmployeePayrollApp.dto.EmployeePayrollDTO;
import com.example.EmployeePayrollApp.model.EmployeePayroll;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEmployeePayrollService {
    List<EmployeePayroll> getAllEmployee();
    EmployeePayroll getEmployeeById(int id);
    EmployeePayroll createEmployee(EmployeePayrollDTO dto);
    EmployeePayroll updateEmployee(int id, EmployeePayrollDTO dto);
    void deleteEmployee(int id);
}
