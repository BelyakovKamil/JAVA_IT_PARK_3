package ru.itpark;

public class Main {

    public static void main(String[] args) {
	Test t1= new Test(5);
	Test t2= new Test(10);
	Test test=null;
//	test.swap(t1, t2);
//        System.out.println("Метод swap: " + test);

        test.mySwap(t1, t2);
//        System.out.println("Метод mySwap: " + test);

    }
}
