package ru.itpark;

public class TV {
    private Channel channels[];

    Channel channel_1 = new Channel("1 Канал");
    Channel channel_2 = new Channel("Россия 1");
    Channel channel_3 = new Channel("Россия 2");
    Channel channel_4 = new Channel("Росссия 24");
    Channel channel_5 = new Channel("СТС");


    public static void showMenu() {
        System.out.println("Выберете канал.");
        System.out.println("1.Первый.");
        System.out.println("2.Россия 1.");
        System.out.println("3.Россия 2.");
        System.out.println("4.Россия 24.");
        System.out.println("5.СТС.");
        System.out.println("6. Выключить");
    }
}

