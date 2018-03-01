package org.xxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(TBookApplication.class, args);
        System.out.println("Hei,TimeBook is ready!--> http://127.0.0.1:8080/");
    }
    
}
