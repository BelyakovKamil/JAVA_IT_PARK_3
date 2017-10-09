package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum=0;
	Scanner in = new Scanner(System.in);
    for (int i=1;i<=1000; i++){
        sum +=i;
    }
    for (int i = 1; i<=999; i++){
        int b = in.nextInt();
        sum -=b;
    }
        System.out.println("Пропущен число " + sum);
    }
}
