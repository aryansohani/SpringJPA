package com.aryan.springjpainjobapp.repository;

import com.aryan.springjpainjobapp.model.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<Jobs,Integer> {


}
