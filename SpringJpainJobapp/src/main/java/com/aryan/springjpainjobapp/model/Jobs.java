package com.aryan.springjpainjobapp.model;

import jakarta.persistence.*;

@Entity
public class Jobs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // ✅ auto increment
    @Column(name = "job_id")
    private int jobId;

    @Column(name = "jobrole")
    private String jobRole;

    @Column(name = "jobdesc")
    private String jobDesc;

    @Column(name = "salary")
    private int salary;

    // GETTERS & SETTERS

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "jobId=" + jobId +
                ", jobRole='" + jobRole + '\'' +
                ", jobDesc='" + jobDesc + '\'' +
                ", salary=" + salary +
                '}';
    }
}