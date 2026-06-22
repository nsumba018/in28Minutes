package com.rab;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));


        System.out.print("Task3 Kicked Off");
        for(int i = 300; i < 399; i++)
            System.out.print(i + " ");
        System.out.print("\nTask 3 Done");
        executorService.shutdown();
    }
}
