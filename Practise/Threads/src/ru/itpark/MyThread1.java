package ru.itpark;


public class MyThread1 implements Runnable {
    Thread thrd;

    MyThread1(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + thrd.getName() + ", счетчик: " + count);
            }
        } catch (InterruptedException e){
            System.out.println(thrd.getName() + "  прерван");
        }
        System.out.println(thrd.getName() + "  завершение");
    }
}
