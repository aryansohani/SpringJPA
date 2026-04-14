package com.aryan.springjpainjobapp.service;

import com.aryan.springjpainjobapp.model.Jobs;
import com.aryan.springjpainjobapp.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Jobservice {

    @Autowired
    private JobRepo repo;

    public void addjob(Jobs job)
    {
        repo.save(job);
    }

    public List<Jobs> getalljobs()
    {
      return  repo.findAll();
    }

    public Jobs getjob(int jobid)
    {
       return repo.findById(jobid).orElse(null);

    }

    public void updateJob(Jobs job)
    {
        repo.save(job);
    }

    public void deletejob(int id)
    {
        repo.deleteById(id);
    }

    public Jobs getsingleelement(int jobid)
    {
         return repo.findById(jobid).orElse(null);
    }


    public void loaddata() {

        List<Jobs> jobList = Arrays.asList(
                new Jobs("Java Dev", "Spring Boot", 50000),
                new Jobs("Frontend Dev", "React", 40000),
                new Jobs("Data Analyst", "SQL + Python", 45000)
        );
        repo.saveAll(jobList);

    }

    public List<Jobs> searchbykeyword(String keyword)
    {
        return repo.search(keyword);
    }
}
