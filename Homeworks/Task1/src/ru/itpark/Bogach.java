package ru.itpark;

import java.util.Scanner;

public class Bogach {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int k5 = 0, k1 = 0, h5 =0, h1=0, five10=0, ten=0, five=0, two=0, one=0;
        System.out.println("Введите сумму:");
        System.out.println();
        int balance = in.nextInt();
        while (balance > 0) {
            if (balance >= 5000) {
                balance -= 5000;
                k5++;
            }
            else {
                if (balance >= 1000) {
                    balance -= 1000;
                    k1++;
                }
                else{
                    if (balance>= 500) {
                        balance -=500;
                        h5++;
                    }
                    else{
                        if (balance >=100){
                            balance -= 100;
                            h1++;
                        }
                        else{
                            if(balance >= 50){
                                balance -=50;
                                five10++;
                            }
                            else {
                                if (balance >=10){
                                    balance -=10;
                                    ten++;
                                }
                                else{
                                    if(balance>=5){
                                        balance -=5;
                                        five++;
                                    }
                                    else{
                                        if (balance >=2){
                                            balance -=2;
                                            two++;
                                        }
                                        else {
                                            if (balance>=1){
                                                balance -=1;
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
        System.out.println("5000 - " + k5 + "; 1000 - " + k1 + "; 500 - " + h5 + "; 100 - " + h1 +
        "; 50 - " + five10 + "; 10 - " + ten + "; 5 - " + five + "; 2 - " + two + "; 1 - " + one);
    }
}
