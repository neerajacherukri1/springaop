package com.neoteric.aopMethodExecute;

public class SampleService {

    public void performTask() throws InterruptedException {
        Thread.sleep(1000); // Simulate a task
        System.out.println("Task performed");
    }

}
