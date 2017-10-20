package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0, local_max=0, max_length=1, max=0;
        System.out.println("Введите количество элементов в ");
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        while (true) {
            System.out.println("МЕНЮ:");
            System.out.println("1. Сумма четных эл-ов");
            System.out.println("2. Сумма нечетных эл-ов");
            System.out.println("3. Сумма эл-ов на четных позициях");
            System.out.println("4. Сумма эл-ов на нечетных позициях");
            System.out.println("5. Кол-во локальных максимумов");
            System.out.println("6. Максимально длинная последоваетльность");
            System.out.println("7. Заменить элементы равные нулю");
            int command = in.nextInt();
            metka:
            switch (command) {
                case 1:
                    sum =0;
                    for (int i = 0; i < n; i++) {
                        if (a[i] % 2 == 0) {
                            sum += a[i];
                        }
                    }
                    System.out.println("Сумма четных эл-ов = " + sum +"\n");
                    break metka;
                case 2:
                    sum = 0;
                    for (int i = 0; i < n; i++) {
                        if (a[i]%2 != 0) {
                            sum += a[i];
                        }
                    }
                    System.out.println("Сумма нечетных эл-ов = " + sum+"\n");
                    break metka;

                case 3:
                    sum = 0;
                    for (int i = 0; i < n; i++) {
                        if (i % 2 == 0) {
                            sum += a[i];
                        }
                    }
                    System.out.println("Сумма эл-ов на четных позициях = " + sum+"\n");
                    break metka;
                case 4:
                    sum = 0;
                    for (int i = 0; i < n; i++) {
                        if (i % 2 != 0) {
                            sum += a[i];
                        }
                    }
                    System.out.println("Сумма эл-ов на нечетных позициях = " + sum+"\n");
                    break metka;
                case 5:
                    for (int i=1; i<n-1; i++){
                        if(a[i]>a[i-1] && a[i]>a[i+1]){
                            local_max++;
                        }
                    }
                    System.out.println("Всего локальных максимумов = " + local_max + "\n");
                    break metka;

                case 6:
                    for (int i=0; i<n-1; i++){
                        if (a[i+1]>a[i]){
                            max++;
                            if (max>max_length){
                                max_length = max;
                            }
                        }
                        else{
                            max=1;
                        }
                    }
                    System.out.println("Максимально длинная последовательность состоит из " + max_length + " элементов" +"\n");
                    break metka;
                case 7:
                    for (int i=0; i<n-1; i++){
                        if(a[i]==0){
                            a[i]= a[i+1] * (-1);
                        }
                    }
                    System.out.println("Измененный массив: ");
                    for (int i=0; i<n; i++) {
                        System.out.print(a[i] + " " + "\n");
                    }
                    break;


                 default:
                     System.out.println("Команда не верна!!!" +"\n");

            }
        }
    }
}
