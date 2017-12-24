package ru.itpark;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int array[];
    static int result;

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        int numbersCount = in.nextInt();
        array = new int[numbersCount];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1001);
        }
        long summa = 0;
//        for (int i : array) summa += i;
        for (int i=0; i<array.length;i++){
            summa+=array[i];
        }

        System.out.println(summa);



//        Scanner in = new Scanner(System.in);
//        int numbersCount = in.nextInt();
//        array = new int[numbersCount];
//        int start = 0, end = 0;
        int blockCount = in.nextInt();
        Worker workers[] = new Worker[blockCount];
        int blockSize = numbersCount / blockCount;
        int start = 0;
        int end = blockSize;
        for (int i = 0; i < blockCount - 1; i++) {
            workers[i] = new Worker(array, start, end);
            start += blockSize;
            end += blockSize;
        }
        end = numbersCount;
        workers[blockCount - 1] = new Worker(array, start, end);



//        for (int i = 0; i < blockCount; i++) {
//            start = end;
//            end = end + numbersCount / blockCount;
//            if (i == blockCount - 1) {
//                System.out.println("[" + start + ".." + array.length + "]");
//                workers[i]=new Worker(array,start,end);
//            } else {
//                System.out.println("[" + start + ".." + end + "]");
//                workers[i]=new Worker(array,start,end);
//            }
//        }

//        for (int i = 0; i < blockCount; i++) {
//            workers[i].sum();
//            System.out.println(result);
        for (int i = 0; i < blockCount; i++) {
            workers[i].start();//бывший workers[i].sum;
//            System.out.println(result);
        }
        for (int i=0; i<blockCount;i++) {
            workers[i].join();
        }
        System.out.println(result);



    }
}



