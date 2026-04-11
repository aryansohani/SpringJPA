package com.aryan.springjpacreateandsave.repository;

import com.aryan.springjpacreateandsave.model.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface airplanerepo extends JpaRepository<Airplane,Integer>
{

}
