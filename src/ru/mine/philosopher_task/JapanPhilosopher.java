package ru.mine.philosopher_task;

import java.util.concurrent.Semaphore;

import static java.lang.Thread.sleep;

public class JapanPhilosopher implements Runnable{
    final private Semaphore leftStcik;
    final private Semaphore rightStcik;
    boolean isFull = false;
    final private String name;

    JapanPhilosopher(Semaphore leftStcik, Semaphore rightStcik, String name) {
        this.leftStcik = leftStcik;
        this.rightStcik = rightStcik;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            if (!isFull) {
                leftStcik.acquire();
                rightStcik.acquire();
                System.out.println(name + " садится есть");
                sleep(750);
                System.out.println(name + " поел и выходит из-за стола");
                isFull = true;
                leftStcik.release();
                rightStcik.release();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Error!");
        }
    }
}
