package ru.itpark.autowired_3;

public class FriendlyWaiterImpl implements Waiter {
    public void giveMenu() {
        System.out.println("Добрый день! Вот ваше меню.");
    }

    public void giveFood() {
        System.out.println("Вот ваша ед, сэр!");
    }

    public void takePlates() {
        System.out.println("Разрешите забрать посуду!");
    }
}
