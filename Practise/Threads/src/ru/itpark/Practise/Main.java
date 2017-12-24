package ru.itpark.Practise;


import ru.itpark.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread mt =new MyThread("AZAZAZAZ");

        for (int i=0; i<50; i++){
            System.out.println("AXAXAXAXAXAXA");
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                System.out.println("Прерывание основного потока");
            }
        }

        System.out.println("Завершение основоного потока");

    }
}
