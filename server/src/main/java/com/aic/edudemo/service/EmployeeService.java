package com.aic.edudemo.service;

import java.util.Objects;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.aic.edudemo.domain.Employee;
import com.aic.edudemo.repository.EmployeeRepository;
import com.aic.edudemo.web.vm.EmployeeRequestVM;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Page<Employee> findAll(Pageable pageable) {
        return this.employeeRepository.findAll(pageable);
    }

    public Page<Employee> findEmployees(Pageable pageable, EmployeeRequestVM employee) {
        this.format(employee);
        return employeeRepository.findEmployees(pageable, employee);
    }

    public Employee save(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    public void delete(Employee employee) {
        this.employeeRepository.deleteById(employee.getEmployeeId());
    }

    private EmployeeRequestVM format(EmployeeRequestVM employee) {
        if (!Objects.equals(employee.getFirstName(), "%")) {
            employee.setFirstName("%" + employee.getFirstName() + "%");
        }
        if (!Objects.equals(employee.getLastName(), "%")) {
            employee.setLastName("%" + employee.getLastName() + "%");
        }
        return employee;
    }
}