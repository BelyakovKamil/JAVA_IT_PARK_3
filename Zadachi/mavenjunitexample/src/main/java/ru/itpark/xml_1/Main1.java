package ru.itpark.xml_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");
        Restaurant restaurant=
                context.getBean( "restaurant_fr",Restaurant.class);
        restaurant.welcome();

        restaurant=context.getBean("restaurant_grm",Restaurant.class);
        restaurant.welcome();



//        FriendlyWaiterImpl friendlyWaiter = new FriendlyWaiterImpl();
//        Restaurant restaurant = new Restaurant();
//        restaurant.setWaiter(friendlyWaiter);
//        restaurant.welcome();
//        System.out.println("Через FriendlyWaiter");
//        friendlyWaiter.giveMenu();
    }
}
