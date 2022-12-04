package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController

public class MaintenanceMonitorController {


    private MaintenanceMonitor mainMon = new MaintenanceMonitor();


    @GetMapping("/api/message")
    public String feedback(@RequestParam(name = "inputMessage", required = false) String inputMessage) {
        if (inputMessage == null) {
            return mainMon.getStatus();
        } else {
            DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            mainMon.input(inputMessage + "<br>last updated " + dtf.format(now) );
            return "OK";
        }
    }

        @GetMapping("/api/message/reset")
                public String reset(){
            DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            mainMon.input("Everything works  as expected" +  "<br>last updated " + dtf.format(now));
            return "OK";
        }
        @GetMapping("/error")
    public String error(){
        return"no valid Target, try localhost=:8080/api/message";
        }

}
