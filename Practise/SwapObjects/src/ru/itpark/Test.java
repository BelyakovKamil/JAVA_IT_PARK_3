package ru.itpark;

/**
 * Created by Kamil on 03.12.2017.
 */
public class Test {
    int a;
    Test(int i){ a= i;}
    void swap( Test ob1, Test ob2){
        int t;
        t=ob1.a;
        ob1.a=ob2.a;
        ob2.a=t;
    }

    void  mySwap(Test ob1, Test ob2){
        Test temp;
        temp=ob1;
        ob1=ob2;
        ob2=temp;
    }
}
