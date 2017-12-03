package ru.itpark;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Properties;


public class ComponentsFactory {
    private static final ComponentsFactory instance;
    private Properties properties;


    private ComponentsFactory(){
        properties=new Properties();
        try{
            properties.load(new FileReader("application.properties"));
        }
        catch (IOException e){
            throw  new IllegalArgumentException(e);
        }
    }

    public Message getMessageComponent(){
        String messageText=properties.getProperty("message.text");
        String className=properties.getProperty("message.class");
        try{
            Class<Message> messageClass= (Class<Message>)Class.forName(className);//находим данный класс, в нашем случае MessageByeImpl
            Constructor<Message> messageConstructor= messageClass.getConstructor(String.class);//Получуили конструтор данного класса, где праметром выступает перменная с типом String
            Message message = messageConstructor.newInstance(messageText);//Создали экземпляр данного класса
            return message;
        } catch (ReflectiveOperationException exc){
            throw new IllegalArgumentException(exc);
        }
    }

    public MessageRenderer getMessageRendererComponent(){
        String messageText = properties.getProperty("message.text");
        String classNameMessage=properties.getProperty("message.class");
        String classNameRenender=properties.getProperty("renderer.class");
        try{
            Class<Message> messageClass= (Class<Message>)Class.forName(classNameMessage);
            Constructor<Message> messageConstructor= messageClass.getConstructor(String.class);
            Message message = messageConstructor.newInstance(messageText); //создали объект класса Message
            Class<MessageRenderer> messageRendererClass=(Class<MessageRenderer>)Class.forName(classNameRenender);//нашли класс данный класс, в нашем случае это MessageErrorOutImpl
            Constructor<MessageRenderer> messageRendererConstructor=messageRendererClass.getConstructor(Message.class);//получили конструктор данного класса, где параметром выступает тип Message
            MessageRenderer messageRenderer = messageRendererConstructor.newInstance(message);//Создали экземпляр(объект) данного класса
            return messageRenderer;
        } catch (ReflectiveOperationException exc){
            throw  new IllegalArgumentException(exc);
        }
    }

//    }

    static {
        instance = new ComponentsFactory();
    }

    public static  ComponentsFactory getInstance(){
        return instance;
    }
}
