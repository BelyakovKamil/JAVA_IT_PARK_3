package ru.itpark;

/**
 * Created by Ofice on 20.10.2017.
 */
public class Triangle extends Figures {

    private double a, b, c;

    Triangle(double a, double b, double c) {
        if (a + b < c | a + c < b | a + c < b) {
            this.a = 1;
            this.b = 1;
            this.c = 1;
        } else if (a < 0 | b < 0 | c < 0) {
            this.a = 1;
            this.b = 1;
            this.c = 1;
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    void getArea(){
        double p= (a+b+c)/2;
        p=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Площадь тругольника = " + Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
    void getPerimeter(){
        System.out.println("Периметр треугольника = " + (a+b+c));
    }
}
