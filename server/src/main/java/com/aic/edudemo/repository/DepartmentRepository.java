package com.aic.edudemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aic.edudemo.domain.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    @Query("Select d.departmentId, d.departmentName From Department d")
    List<Object[]> findDepartmentLabelValue();
}
