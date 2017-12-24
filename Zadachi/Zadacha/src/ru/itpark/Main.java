package ru.itpark;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int[] array;

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int numbersCount=in.nextInt();
        array=new int[numbersCount];
        Random random=new Random();
        for (int i=0; i<array.length; i++){
            array[i]=random.nextInt(1001);
        }
        long summa=0;
        for(int i: array) summa+=i;

        System.out.println(summa);





    }
}
