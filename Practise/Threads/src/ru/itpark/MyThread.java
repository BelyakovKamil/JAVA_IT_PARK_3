package ru.itpark;


public class MyThread implements Runnable {
    String thrdName;

    MyThread(String name) {
        thrdName = name;
    }

    @Override
    public void run() {
        System.out.println(thrdName + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + thrdName + ", счетчик: " + count);
            }
        } catch (InterruptedException e){
            System.out.println(thrdName + "  прерван");
        }
        System.out.println(thrdName + "  завершение");
    }
}
