package org.web.gnfrapp;


import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "org.web")
@EntityScan("org.web.model")
@EnableJpaRepositories("org.web.repositories")
public class App   
{
    public static void main( String[] args ) throws ParseException
    {
        SpringApplication.run(App.class, args);
    }
}
