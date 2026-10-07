package com.aic.edudemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aic.edudemo.domain.Employee;
import com.aic.edudemo.repository.EmployeeRepository;

@SpringBootTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void findAll_shouldReturnEmployees() {
        List<Employee> list = employeeRepository.findAll();
        System.out.println("員工總數: " + list.size());
        assertFalse(list.isEmpty());
        assertEquals(116, list.size());
    }

       @Test
    void findById_shouldReturnEmployee() {
        // 先從資料庫取一筆實際存在的員工,再用他的編號查詢
        Employee first = employeeRepository.findAll().get(0);
        Optional<Employee> emp = employeeRepository.findById(first.getEmployeeId());
        assertTrue(emp.isPresent());
        System.out.println("員工: " + emp.get());
    }
}