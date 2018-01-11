package ru.itpark.DaemonThread;

public class DaemonThredTest {

    public static void main(String[] args) {
        new WorkerThread().start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // handle here exception
        }

        System.out.println("Main Thread ending");
    }

}



