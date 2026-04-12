package com.aryan.springjpafetchdata.Repository;

import com.aryan.springjpafetchdata.model.Trains;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrainRepository extends JpaRepository<Trains,Integer> {



    List<Trains> findByTrainname(String trainname);

    List<Trains> findBytraindestination(String traindestination);

    // greater than
    List<Trains> findBytrainIDGreaterThan(int id);

    // less than
    List<Trains> findBytrainIDLessThan(int id);

    // equals
    List<Trains> findBytrainID(int id);





}
