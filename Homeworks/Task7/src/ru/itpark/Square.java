package ru.itpark;



public class Square extends Figures {
    private double length;

    public Square(double length){
        if (length<0)
            this.length=1;
        else
            this.length = length;

    }


    void getArea(){
   System.out.println("Площадь квадрата = " +length *length);
        return;
    }


    void getPerimeter(){
      System.out.println("Периметр квадрата = "+  4*length);
        return;
    }
}
