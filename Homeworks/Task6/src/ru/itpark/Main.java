package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Program firstChanel[]= new Program[1];


        Channel channel= new Channel("1 Kanal",1, firstChanel);
        channel.getPrograms();

    }
}
