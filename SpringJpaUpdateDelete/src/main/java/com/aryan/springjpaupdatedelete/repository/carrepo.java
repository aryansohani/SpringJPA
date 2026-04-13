package com.aryan.springjpaupdatedelete.repository;

import com.aryan.springjpaupdatedelete.model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface carrepo extends JpaRepository<Cars,Integer> {

    @Query("SELECT c FROM Cars c WHERE c.carid > :id")
    List<Cars> findBycaridGreaterThan(@Param("id") int id);



}
