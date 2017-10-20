package ru.itpark;


public class Circle extends Figures {
    private double radius;
    Circle (double radius){
        if (radius < 0)
            this.radius=1;
        else this.radius=radius;
    }

    void getArea(){
        System.out.println("Площадь круга = " + Math.PI * radius* radius );
    }

    void getPerimeter(){
        System.out.println("Периметр круга = " + 2* Math.PI * radius);
    }
}
