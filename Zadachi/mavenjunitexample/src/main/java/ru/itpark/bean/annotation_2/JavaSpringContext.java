package ru.itpark.bean.annotation_2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaSpringContext {

//    @Bean
//    public Restaurant restaurantGrm(){
//        Restaurant restaurant= new Restaurant();
//        restaurant.setWaiter(grandmotherWaiter());
//        return restaurant;
//    }
//
    @Bean
    public Restaurant restaurantFr(){
        Restaurant restaurant= new Restaurant();
        restaurant.setWaiter(friendlyWiter());
        return restaurant;
    }



    @Bean
    public  Waiter grandmotherWaiter(){
        return new GrandmotherWaiterImpl();
    }

    @Bean
    public  Waiter friendlyWiter(){
        return new FriendlyWaiterImpl();
    }
}
