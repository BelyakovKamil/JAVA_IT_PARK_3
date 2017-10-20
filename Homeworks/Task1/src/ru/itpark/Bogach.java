package ru.itpark;

import java.util.Scanner;

public class Bogach {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int five_thousand = 0, one_thousand = 0, five_hundred = 0, one_hundred = 0, fifty = 0, ten = 0, five = 0, two = 0, one = 0;
        System.out.println("Введите сумму:");
        System.out.println();
        int balance = in.nextInt();
        while (balance > 0) {
            if (balance >= 5000) {
                balance -= 5000;
                five_thousand++;
            } else {
                if (balance >= 1000) {
                    balance -= 1000;
                    one_thousand++;
                } else {
                    if (balance >= 500) {
                        balance -= 500;
                        five_hundred++;
                    } else {
                        if (balance >= 100) {
                            balance -= 100;
                            one_hundred++;
                        } else {
                            if (balance >= 50) {
                                balance -= 50;
                                fifty++;
                            } else {
                                if (balance >= 10) {
                                    balance -= 10;
                                    ten++;
                                } else {
                                    if (balance >= 5) {
                                        balance -= 5;
                                        five++;
                                    } else {
                                        if (balance >= 2) {
                                            balance -= 2;
                                            two++;
                                        } else {
                                            if (balance >= 1) {
                                                balance -= 1;
                                                one++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        System.out.println("5000 - " + five_thousand + "; 1000 - " + one_thousand + "; 500 - " + five_hundred +
                "; 100 - " + one_hundred + "; 50 - " + fifty + "; 10 - " + ten +
                "; 5 - " + five + "; 2 - " + two + "; 1 - " + one);
    }
}
