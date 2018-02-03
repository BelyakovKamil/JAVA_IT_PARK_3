package ru.itpark.bean.annotation_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaSpringContext.class);
        Restaurant restaurant=
                context.getBean( Restaurant.class);
        restaurant.welcome();

//        FriendlyWaiterImpl friendlyWaiter = new FriendlyWaiterImpl();
//        friendlyWaiter.giveMenu();
    }
}
