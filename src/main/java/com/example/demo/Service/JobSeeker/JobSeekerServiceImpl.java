package com.example.demo.Service.JobSeeker;

import com.example.demo.Domain.JobSeeker;
import com.example.demo.Repository.JobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobSeekerServiceImpl implements JobSeekerService {

    @Autowired
    JobSeekerRepository jobSeekerRepository;

    @Override
    public JobSeeker findByName(String name) {
        return jobSeekerRepository.findByName(name);
    }
}
