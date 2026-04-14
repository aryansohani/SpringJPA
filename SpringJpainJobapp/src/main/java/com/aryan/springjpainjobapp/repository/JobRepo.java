package com.aryan.springjpainjobapp.repository;

import com.aryan.springjpainjobapp.model.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<Jobs,Integer> {


    @Query("SELECT j FROM Jobs j WHERE LOWER(j.jobRole) LIKE LOWER(CONCAT('%', :keyword, '%')) OR LOWER(j.jobDesc) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Jobs> search(@Param("keyword") String keyword);


}
