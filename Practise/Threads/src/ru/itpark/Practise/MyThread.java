package ru.itpark.Practise;


public class MyThread extends Thread {

    MyThread(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + getName() + ", счетчик: " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + "  прерван");
        }
        System.out.println(getName() + "  завершение");
    }
}
