package com.iffat.spring6.dependencyinjection;

import com.iffat.spring6.dependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(Spring6DependencyInjectionApplication.class, args);

        System.out.println("Main method");
        MyController myController = context.getBean(MyController.class);
        System.out.println(myController.sayHello());
    }

}
