package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {
       /* Never do this
        CustomerService customerService =
                new CustomerService(new CustomerDataAccessService());
        CustomerController customerController =
                new CustomerController(customerService);

        */
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(Main.class, args);

    }
}






