package ru.itpark;

/**
 * Created by Ofice on 15.11.2017.
 */
public class Human {
    private String name;
    private int age;
    private int height;
    private int weigth;

    public Human(String name, int age, int height, int weigth) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    @Override
    public String toString(){
        return "Human{ name= " + name + " , age= " + age + " , height= " + height + " , weight= " + weigth + " }" ;
    }
}
