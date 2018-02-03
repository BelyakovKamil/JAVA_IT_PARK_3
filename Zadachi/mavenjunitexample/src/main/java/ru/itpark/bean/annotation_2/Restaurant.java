package ru.itpark.bean.annotation_2;

import org.springframework.beans.factory.annotation.Qualifier;

public class Restaurant {
    private Waiter waiter;

    public void  welcome(){
        waiter.giveMenu();
    }

    public Waiter getWaiter(){
        return waiter;
    }

    public  void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }
}
