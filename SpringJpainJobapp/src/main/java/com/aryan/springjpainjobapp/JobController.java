package com.aryan.springjpainjobapp;

import com.aryan.springjpainjobapp.model.Jobs;
import com.aryan.springjpainjobapp.service.Jobservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")   // ✅ base path
public class JobController {

    @Autowired
    private Jobservice service;

    // GET ALL
    @GetMapping
    public List<Jobs> getalljobs()
    {
        return service.getalljobs();
    }

    // ADD
    @PostMapping
    public void addjob(@RequestBody Jobs job)
    {
        service.addjob(job);
    }

    // UPDATE
    @PutMapping
    public void updatejob(@RequestBody Jobs job)
    {
        service.updateJob(job);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id)
    {
        service.deletejob(id);
    }

    // GET SINGLE
    @GetMapping("/{jobid}")
    public Jobs singlejob(@PathVariable int jobid)
    {
        return service.getsingleelement(jobid);
    }

    @GetMapping("Load")
    public void loaddata()
    {
        service.loaddata();
    }

    @GetMapping("Keyword/{keyword}")
    public List<Jobs> searchbykeyword(@PathVariable("keyword")String keyword)
    {
        return service.searchbykeyword(keyword);
    }

}