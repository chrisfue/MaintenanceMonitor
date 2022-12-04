package com.example.maintenancemonitor;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceMonitorTest {
    //Test für gültigen Input
    @Test
    public void test_checkInputIsTakenToStatus(){

        //Arrange
        MaintenanceMonitor mTest = new MaintenanceMonitor();
        //Act
        String inputMessage = "Servers down till 5pm!";
        mTest.input(inputMessage);
        //Assert
        Assertions.assertEquals(inputMessage,mTest.getStatus());
    }
    //Test für keinen Input
    @Test
    public void test_nullDoesNotChangeStatud(){
        MaintenanceMonitor mTest = new MaintenanceMonitor();
        mTest.input(null);
        Assertions.assertEquals(mTest.getStatus(),"Everything works  as expected");
    }

}