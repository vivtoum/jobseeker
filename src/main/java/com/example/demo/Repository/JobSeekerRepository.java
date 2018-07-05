package com.example.demo.Repository;

import com.example.demo.Domain.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerRepository extends JpaRepository<JobSeeker, Long> {

    JobSeeker findByName(String name);
}
