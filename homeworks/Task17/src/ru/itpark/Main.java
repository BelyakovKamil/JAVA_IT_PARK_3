package ru.itpark;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int array_NxM[][];


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        System.out.print("Количество строк: ");
        int n=in.nextInt();
        System.out.print("Количество столбцов: ");
        int m=in.nextInt();
        array_NxM= new int [n][m];
        Random random =new Random();
        for (int i=0; i<n; i++){
            for( int j=0; j<m; j++){
                array_NxM[i][j]=  random.nextInt(1001);
            }
        }

        for (int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array_NxM[i][j]+" ");

            }
            System.out.println();
        }

        System.out.println("Введите число, которое хотите найти");
        int b=in.nextInt();




    }
}
