package com.example.EmployeePayrollApp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmployeePayrollDTO {
    @NotBlank(message = "Name should not be empty")
    public String name;

    @Min(value = 1000, message = "Salary should be greater than 1000")
    public long salary;
}
