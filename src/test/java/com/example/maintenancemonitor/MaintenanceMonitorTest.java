package com.example.maintenancemonitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceMonitorTest {
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


}