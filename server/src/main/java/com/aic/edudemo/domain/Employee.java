  package com.aic.edudemo.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEES")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYEES_SEQ")
    @SequenceGenerator(allocationSize = 1, name = "EMPLOYEES_SEQ")
    private Integer employeeId;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate hireDate;
    private String jobId;
    private BigDecimal salary;
    private BigDecimal commissionPct;
    private Integer managerId;
    private Integer departmentId;
}