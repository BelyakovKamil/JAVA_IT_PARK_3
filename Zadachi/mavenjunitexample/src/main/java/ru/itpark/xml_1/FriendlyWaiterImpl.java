package ru.itpark.xml_1;

public class FriendlyWaiterImpl implements Waiter {
    public void giveMenu() {
        System.out.println("Добрый день! Вот ваше меню.");
    }

    public void giveFood() {
        System.out.println("Вот ваша еда, сэр!");
    }

    public void takePlates() {
        System.out.println("Разрешите забрать посуду!");
    }
}
