package com.aic.edudemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aic.edudemo.domain.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, String> {

    @Query("Select j.jobId, j.jobTitle From Job j")
    List<Object[]> findJobLabelValue();
}