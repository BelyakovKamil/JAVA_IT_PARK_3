package ru.itpark.autowired_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Restaurant {

    @Autowired
    @Qualifier("friendlyWaiter")
    private Waiter waiter;

    public void  welcome(){
        waiter.giveMenu();
    }
}
