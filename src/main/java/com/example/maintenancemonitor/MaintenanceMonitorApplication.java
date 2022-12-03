package com.example.maintenancemonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MaintenanceMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaintenanceMonitorApplication.class, args);
        System.out.println("started");
    }

}
