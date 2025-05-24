package com.example.EmployeePayrollApp.service.impl;

import com.example.EmployeePayrollApp.dto.EmployeePayrollDTO;
import com.example.EmployeePayrollApp.model.EmployeePayroll;
import com.example.EmployeePayrollApp.repository.EmployeePayrollRepository;
import com.example.EmployeePayrollApp.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Autowired
    private EmployeePayrollRepository repository;

    public List<EmployeePayroll> getAllEmployee()
    {
        return repository.findAll();
    }

    public EmployeePayroll getEmployeeById(int id)
    {
        return repository.findById(id).orElse(null);
    }

    public EmployeePayroll createEmployee(EmployeePayrollDTO dto)
    {
        EmployeePayroll employee = new EmployeePayroll(0, dto.getName(), dto.getSalary());
        return repository.save(employee);
    }

    public EmployeePayroll updateEmployee(int id, EmployeePayrollDTO dto)
    {
        EmployeePayroll employee = new EmployeePayroll(id, dto.getName(), dto.getSalary());
        return repository.save(employee);
    }

    public void deleteEmployee(int id)
    {
        repository.deleteById(id);
    }
}
