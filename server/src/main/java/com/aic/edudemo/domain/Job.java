package com.aic.edudemo.domain;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "JOBS")
public class Job {

    @Id
    private String jobId;

    private String jobTitle;

    private BigDecimal minSalary;

    private BigDecimal maxSalary;
}