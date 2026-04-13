package com.aryan.springjpainjobapp.service;

import com.aryan.springjpainjobapp.model.Jobs;
import com.aryan.springjpainjobapp.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}
