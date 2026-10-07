package com.aic.edudemo.web.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aic.edudemo.domain.Employee;
import com.aic.edudemo.service.EmployeeService;
import com.aic.edudemo.web.vm.EmployeeRequestVM;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/employees/all")
    public Object findEmployees(Pageable pageable) {
        return this.employeeService.findAll(pageable);
    }

    @GetMapping("/employees")
    public Object findEmployees(Pageable pageable, @ModelAttribute EmployeeRequestVM employee) {
        return this.employeeService.findEmployees(pageable, employee);
    }

    @PostMapping("/employee/save")
    public Object saveEmployee(@RequestBody Employee employee) {
        return this.employeeService.save(employee);
    }

    @PostMapping("/employee/delete")
    public void deleteEmployee(@RequestBody Employee employee) {
        this.employeeService.delete(employee);
    }
}