package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {


    private MaintenanceMonitor mainMon = new MaintenanceMonitor();


    @GetMapping("/api/message")
    public String enterMessage(@RequestParam(name="inputMessage")String inputMessage){
        return mainMon.input(inputMessage);
    }

}
