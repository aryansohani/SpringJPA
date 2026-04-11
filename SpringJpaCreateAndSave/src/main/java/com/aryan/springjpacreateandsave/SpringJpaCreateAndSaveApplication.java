package com.aryan.springjpacreateandsave;

import com.aryan.springjpacreateandsave.model.Airplane;
import com.aryan.springjpacreateandsave.repository.airplanerepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpaCreateAndSaveApplication {

    public static void main(String[] args) {

       ApplicationContext context= SpringApplication.run(SpringJpaCreateAndSaveApplication.class, args);

        airplanerepo repo= context.getBean(airplanerepo.class);

        Airplane a1= context.getBean(Airplane.class);
        a1.setPlaneid(1);
        a1.setName("Indian airlines");
        a1.setDestination("Kashmir");

        Airplane a2=context.getBean(Airplane.class);
        a2.setPlaneid(2);
        a2.setName("fly emirates");
        a2.setDestination("dubai");

        Airplane a3= context.getBean(Airplane.class);
        a3.setPlaneid(3);
        a3.setName("russian airlines");
        a3.setDestination("russia");

        repo.save(a1);
        repo.save(a2);
        repo.save(a3);


    }

}
