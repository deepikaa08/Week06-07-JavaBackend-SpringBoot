package com.example.EmployeePayrollApp.repository;

import com.example.EmployeePayrollApp.model.EmployeePayroll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayroll, Integer> {
}
