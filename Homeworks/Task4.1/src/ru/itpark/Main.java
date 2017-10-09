package ru.itpark;

public class Main {
    public static int parse(char digits[]) {
        int k = 0;
        int digitInt = 0;
        for (int i = 0; i < digits.length; i++) {
            k = ((int) digits[i] - 48) * (int) Math.pow(10, (digits.length - i - 1));
            digitInt += k;
        }
        return digitInt;
    }

    public static void main(String[] args) {

        char[] number = {'1', '2', '3',  '7'};
        int numberAsInt = parse(number);

        System.out.println(numberAsInt);
    }
}


