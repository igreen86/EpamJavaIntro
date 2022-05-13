package ru.mine.philosopher_task;

import java.util.concurrent.Semaphore;

public class JapanPhisosopherRunner {

    public static void main(String[] args) {
        Semaphore leftStick = new Semaphore(3);
        Semaphore rightStick = new Semaphore(2);
        Semaphore stick = new Semaphore(5);

        JapanPhilosopher philosopher1 = new JapanPhilosopher(stick, stick, "Йошида");
        JapanPhilosopher philosopher2 = new JapanPhilosopher(stick, stick, "Бусидо");
        JapanPhilosopher philosopher3 = new JapanPhilosopher(stick, stick, "Тояма");
        JapanPhilosopher philosopher4 = new JapanPhilosopher(stick, stick, "Токанава");
        JapanPhilosopher philosopher5 = new JapanPhilosopher(stick, stick, "Комуто");
        new Thread(philosopher1).start();
        new Thread(philosopher2).start();
        new Thread(philosopher3).start();
        new Thread(philosopher4).start();
        new Thread(philosopher5).start();
    }
}
