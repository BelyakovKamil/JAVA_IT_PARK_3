package ru.itpark;

/**
 * Created by Ofice on 19.10.2017.
 */
public class Rectangle extends Figures {
    private double length, width;

    Rectangle(double length, double width) {
        if (length < 0)
            this.length = 1;
        else
            this.length = length;


        if (width < 0)
            this.width = 1;
        else
            this.width = width;

    }

    void getArea() {
        System.out.println("Площадь прямоугольника = " + length * width);
        return;
    }

    void getPerimeter() {
        System.out.println("Периметр прямоугольника = " + 2 * (length + width));
        return;
    }


}
