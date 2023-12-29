package com.iffat.spring6.dependencyinjection;

import com.iffat.spring6.dependencyinjection.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DependencyInjectionApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyController myController;

    @Test
    void testAutowireOfController() {
        System.out.println(myController.sayHello());
    }

    @Test
    void testGetControllerFromContext() {
        MyController myController = applicationContext.getBean(MyController.class);
        System.out.println(myController.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
