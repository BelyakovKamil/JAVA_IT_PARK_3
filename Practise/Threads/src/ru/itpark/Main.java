package ru.itpark;

public class Main {

    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread1 mt= new MyThread1("KEK");

//        Thread newThrd= new Thread(mt);
//        newThrd.start();

        for (int i=0; i<50; i++){
            System.out.println("LOL");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                System.out.println("Прерывание основного потока");
            }
        }
        System.out.println("Завершение основго потока");
    }
}
