package ru.itpark;

import com.sun.org.apache.regexp.internal.RE;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(2, 3);
        Ellipse ellipse = new Ellipse(3, 1);
        Circle circle = new Circle(2);
        Triangle triangle= new Triangle(2,3,4);
        Figures figures[] = {square, rectangle, ellipse,circle,triangle};
        for (int i = 0; i < figures.length; i++) {
            figures[i].getPerimeter();
            figures[i].getArea();
            System.out.println("___________________\n");
        }


    }
}
