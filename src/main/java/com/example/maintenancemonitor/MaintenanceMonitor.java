package com.example.maintenancemonitor;

public class MaintenanceMonitor {

    public MaintenanceMonitor(){}

    private String status= "Everything works as expected";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public String  input (String inputMessage){

        if(inputMessage==null){
        return "test";}
        else return inputMessage;

    };
}
