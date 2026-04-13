package com.aryan.springjpaupdatedelete;

import com.aryan.springjpaupdatedelete.model.Cars;
import com.aryan.springjpaupdatedelete.repository.carrepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpaUpdateDeleteApplication {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(SpringJpaUpdateDeleteApplication.class, args);
        Cars c1=context.getBean(Cars.class);
        Cars c2= context.getBean(Cars.class);
        Cars c3=context.getBean(Cars.class);

        c1.setCarid(1);
        c1.setCarname("BMW");
        c1.setCost(1000);

        c2.setCarid(2);
        c2.setCarname("mercedes");
        c2.setCost(2000);

        c3.setCarid(3);
        c3.setCarname("lambo");
        c3.setCost(3000);

        carrepo repo= context.getBean(carrepo.class);

        repo.save(c1);
        repo.save(c2);
        repo.save(c3);

        System.out.println(repo.findAll());

        System.out.println(" ");

        //after updation
        c3.setCarname("Redbull");

        repo.save(c3);

        System.out.println(repo.findById(3));

        System.out.println(" ");

        repo.delete(c2);

        System.out.println(repo.findAll());




    }

}
