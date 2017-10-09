package ru.itpark;

public class Main {

    public static void main(String[] args) {
        int k =0;
        int digitsInt =0;
        char[] digits = {'1', '2', '3', '4', '7'};
        for (int i=0; i<digits.length; i++){
            k= ((int) digits[i]-48) *(int) Math.pow(10, (digits.length-i-1));
            digitsInt +=k;
        }
        System.out.println(digitsInt);
    }
}
