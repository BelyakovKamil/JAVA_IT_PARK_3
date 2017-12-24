package ru.itpark;

/**
 * Created by Kamil on 03.12.2017.
 */
public class Stack {
    private char s[];
    private int tos; // вершина стека

    Stack( int size){
        s= new char[size];
        tos=0;
    }

    Stack(Stack ob){
        tos=ob.tos;
        s=new char[ob.s.length];
        for( int i=0; i<tos; i++){
            s[i]=ob.s[i];
        }
    }

    Stack (char[] a){
        s=new char[a.length];

        for ( int i=0; i<a.length;i++){
            push(a[i]);
        }
    }

    void  push( char ch){
        if(tos==s.length){
            System.err.println("Стек заполнен");
            return;
        }
        s[tos]=ch;
        tos++;
    }

    char pop(){
        if( tos==0){
            System.err.println("Стек пустой");
            return (char) 0;
        }
        tos--;
        return s[tos];
    }
}
