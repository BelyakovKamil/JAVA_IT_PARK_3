package ru.itpark;

import java.sql.SQLOutput;


public class Ellipse extends Figures {

    private double largeaxis, smallaxis;

    Ellipse(double largeaxis, double smallaxis){
        if (largeaxis<0)
            this.largeaxis=1;
        else
            this.largeaxis=largeaxis;

        if(smallaxis<0)
            this.smallaxis=1;
        else
            this.smallaxis=smallaxis;
    }

    void getArea(){
        System.out.println("Площадь эллипса = " + Math.PI*largeaxis*smallaxis);
    }

    void getPerimeter(){
        System.out.println("Периметр эллипса = " + 4*((Math.PI*largeaxis*smallaxis+(largeaxis-smallaxis))/(largeaxis+smallaxis)));
    }

}
