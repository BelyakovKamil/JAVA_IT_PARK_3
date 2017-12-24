package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Stack stk1 = new Stack(5);
        char[] name = {'V', 'i', 'c', 't', 'o', 'r'};
        Stack stk2 = new Stack(name);
        char ch;
        int i;
        for (i = 0; i < 5; i++) {
            stk1.push((char) ('A' + i));
        }
        Stack stk3= new Stack(stk1);

        System.out.print("Содержимое stk1: ");
        for(i=0; i< 5; i++){
            ch=stk1.pop();
            System.out.print(ch);
        }
        System.out.println();

        System.out.print("Содержимое stk2: ");
        for(i=0; i< name.length; i++){
            ch=stk2.pop();
            System.out.print(ch);
        }
        System.out.println();

        System.out.print("Содержимое stk3: ");
        for(i=0; i< 5; i++){
            ch=stk3.pop();
            System.out.print(ch);
        }
        System.out.println();
    }
}
