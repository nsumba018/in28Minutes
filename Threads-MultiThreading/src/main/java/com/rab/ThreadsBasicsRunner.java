package com.rab;

class Task1 extends Thread{
        // Task 1
    public void run(){
        for(int i = 0; i < 100; i++)
            System.out.print(i + " ");
        System.out.print("\nTask 1 Done\n");
    }

}
class Task2 implements Runnable{
    public void run(){
        for(int i = 200; i < 299; i++)
            System.out.print(i + " ");
        System.out.print("\nTask 2 Done\n");
    }

}
public class ThreadsBasicsRunner {
    public static void main(String[] args) throws InterruptedException {

        //Task 1
        System.out.print("Task1 Kicked Off");
        Task1 task1 = new Task1();
        task1.setPriority(1);
        task1.start();

        // Task 2
        System.out.print("Task2 Kicked Off");
        Task2 task2 = new Task2(); // when you use implements Runnable you have to create instance if Threads
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10);

        // wait for task1 to finish
        task1.join();
        
        System.out.print("Task3 Kicked Off");
        for(int i = 300; i < 399; i++)
            System.out.print(i + " ");
        System.out.print("\nTask 3 Done");

    }
}