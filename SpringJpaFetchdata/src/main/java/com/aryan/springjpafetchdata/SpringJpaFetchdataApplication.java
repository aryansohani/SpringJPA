package com.aryan.springjpafetchdata;

import com.aryan.springjpafetchdata.Repository.TrainRepository;
import com.aryan.springjpafetchdata.model.Trains;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJpaFetchdataApplication {

    public static void main(String[] args) {
       ApplicationContext context= SpringApplication.run(SpringJpaFetchdataApplication.class, args);
        Trains t1= context.getBean(Trains.class);
        Trains t2= context.getBean(Trains.class);
        Trains t3= context.getBean(Trains.class);

        t1.setTrainID(1);
        t1.setTrainname("mumbai express");
        t1.setTraindestination("mumbai");

       t2.setTrainID(2);
       t2.setTrainname("delhi local");
       t2.setTraindestination("delhi");

       t3.setTrainID(3);
       t3.setTrainname("kerela metro");
       t3.setTraindestination("kerela");

        TrainRepository trepo= context.getBean(TrainRepository.class);
        trepo.save(t1);
        trepo.save(t2);
        trepo.save(t3);

        System.out.println("findAll()");

        List<Trains> trainslist=trepo.findAll();
        for(Trains Train : trainslist)
        {
            System.out.println(Train);
        }

        System.out.println("findById()");
        System.out.println(trepo.findById(1));// these returns optional class object
        Trains train1 =  trepo.findById(9).orElse(null); // to avoid NoSuchElementException
        System.out.println(train1);


        System.out.println("findByName()");
        System.out.println(trepo.findByTrainname("mumbai express"));

        System.out.println("findbytraindestination()");
        System.out.println(trepo.findBytraindestination("kerela"));

        System.out.println("greaterthan,lessthan.equals");
        System.out.println(trepo.findBytrainIDGreaterThan(1));
        System.out.println(trepo.findBytrainIDLessThan(3));





    }

}
