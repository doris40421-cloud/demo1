package com.aic.edudemo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "DEPARTMENTS")
public class Department {

    @Id
    private Integer departmentId;

    private String departmentName;

    private Integer managerId;

    private Integer locationId;
}