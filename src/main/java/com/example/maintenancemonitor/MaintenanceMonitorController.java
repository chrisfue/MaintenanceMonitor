package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MaintenanceMonitorController {


    private MaintenanceMonitor mainMon = new MaintenanceMonitor();


    @GetMapping("/api/message")
    public String feedback(@RequestParam(name = "inputMessage", required = false) String inputMessage) {
        if (inputMessage == null) {
            return mainMon.getStatus();
        } else {
            mainMon.input(inputMessage);
            return "OK";
        }
    }

        @GetMapping("/api/message/reset")
                public String reset(){
            mainMon.input("Everything works  as expected");
            return "OK";
        }


}
