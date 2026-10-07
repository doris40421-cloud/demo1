package com.aic.edudemo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aic.edudemo.service.LabelValueService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class LabelValueController {

    private final LabelValueService labelValueService;

    // GET all the Jobs as LabelValues
    @GetMapping("/jobsLabelValues")
    public Object jobsLabelValues() {
        return this.labelValueService.findAllJobsAsLabelValues();
    }

    // GET all the Departments as LabelValues
    @GetMapping("/departmentsLabelValues")
    public Object deparmentsLabelValues() {
        return this.labelValueService.findAllDepartmentsAsLabelValues();
    }
}