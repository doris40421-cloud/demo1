package com.aic.edudemo.web.vm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import lombok.Data;

@Data
public class EmployeeRequestVM {

    @JsonSetter(nulls = Nulls.SKIP)
    private String firstName = "%";

    @JsonSetter(nulls = Nulls.SKIP)
    private String lastName = "%";

    private String email;

    private String phoneNumber;

    @DateTimeFormat(iso = ISO.DATE)
    @JsonSetter(nulls = Nulls.SKIP)
    private LocalDate hireDateFrom = LocalDate.parse("0001-01-01");

    @DateTimeFormat(iso = ISO.DATE)
    @JsonSetter(nulls = Nulls.SKIP)
    private LocalDate hireDateTo = LocalDate.parse("9999-12-31");

    private String jobId;

    @JsonSetter(nulls = Nulls.SKIP)
    private BigDecimal salaryFrom = BigDecimal.valueOf(0);

    @JsonSetter(nulls = Nulls.SKIP)
    private BigDecimal salaryTo = BigDecimal.valueOf(99999999.99);

    private List<Integer> departmentIds = new ArrayList<>();
}