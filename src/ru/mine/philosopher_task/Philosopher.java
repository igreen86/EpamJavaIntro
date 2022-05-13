package ru.mine.philosopher_task;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {
    final private Semaphore sem;
    final private String name;
    private boolean isFull = false;

    Philosopher(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            if (!isFull) {
                sem.acquire();
                System.out.println(name + " садится есть");
                sleep(750);
                System.out.println(name + " поел и выходит из-за стола");
                isFull = true;
                sem.release();
//                sleep(750);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Error!");
        }
    }
}
