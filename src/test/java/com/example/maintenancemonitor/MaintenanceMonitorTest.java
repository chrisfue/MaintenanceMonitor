package com.example.maintenancemonitor;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class MaintenanceMonitorTest {

    @Test
    public static void checkInputIsTaken(){

        //Arrange
        MaintenanceMonitor mTest = new MaintenanceMonitor();
        //Act
        String inputMessage = "Servers down till 5pm!";
        mTest.input(inputMessage);
        //Assert
        assertEquals(inputMessage,mTest.getStatus());
    }


}
