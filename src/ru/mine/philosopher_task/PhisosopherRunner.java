package ru.mine.philosopher_task;

import java.util.concurrent.Semaphore;

public class PhisosopherRunner {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2);

        new Philosopher(sem, "Аристотель").start();
        new Philosopher(sem, "Сократ").start();
        new Philosopher(sem, "Диоген").start();
        new Philosopher(sem, "Платон").start();
        new Philosopher(sem, "Пифагор").start();

        Philosopher phil = new Philosopher(sem, "Phil");
        System.out.println("phil.getState() = " + phil.getState());
    }
}
