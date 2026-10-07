package com.aic.edudemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.aic.edudemo.repository.DepartmentRepository;
import com.aic.edudemo.repository.JobRepository;
import com.aic.edudemo.web.vm.LabelValue;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Service
public class LabelValueService {

    private final DepartmentRepository departmentRepository;

    private final JobRepository jobRepository;

    public List<LabelValue> findAllDepartmentsAsLabelValues() {
        List<Object[]> source = this.departmentRepository.findDepartmentLabelValue();
        log.info("Departments: {}", source);

        // 透過 loop 映射 label value 資料
        List<LabelValue> result = new ArrayList<>();
        for (Object[] data : source) {
            LabelValue temp = new LabelValue();
            temp.setValue(String.valueOf((Integer) data[0]));
            temp.setLabel((String) data[1]);
            result.add(temp);
        }
        return result;
    }

    public List<LabelValue> findAllJobsAsLabelValues() {
        List<Object[]> source = this.jobRepository.findJobLabelValue();
        log.info("Jobs: {}", source);

        // 透過 lambda stream 映射 label value 資料
        return source.stream().map(data -> {
            LabelValue temp = new LabelValue();
            temp.setValue((String) data[0]);
            temp.setLabel((String) data[1]);
            return temp;
        }).collect(Collectors.toList());
    }
}