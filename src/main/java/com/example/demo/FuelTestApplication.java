package com.example.demo;

import com.example.demo.example3.Pillar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")
@EnableJpaRepositories("com.example.demo.repository")
@EnableTransactionManagement
public class FuelTestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(FuelTestApplication.class, args);


        //      Pillar p1 = context.getBean(Pillar.class);
        //      Pillar p2 = context.getBean(Pillar.class);

    }

}
