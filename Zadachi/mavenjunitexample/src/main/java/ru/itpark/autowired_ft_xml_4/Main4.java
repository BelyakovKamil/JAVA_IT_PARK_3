package ru.itpark.autowired_ft_xml_4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("context-2.xml");
        Restaurant restaurant=
                context.getBean( Restaurant.class);
        restaurant.welcome();

//        FriendlyWaiterImpl friendlyWaiter = new FriendlyWaiterImpl();
//        Restaurant restaurant = new Restaurant();
//        restaurant.setWaiter(friendlyWaiter);
//        restaurant.welcome();
//        System.out.println("Через FriendlyWaiter");
//        friendlyWaiter.giveMenu();
    }
}
