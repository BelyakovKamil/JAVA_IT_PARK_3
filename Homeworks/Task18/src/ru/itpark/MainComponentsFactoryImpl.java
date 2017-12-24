package ru.itpark;

/**
 * Created by Ofice on 02.12.2017.
 */
public class MainComponentsFactoryImpl {
    public static void main(String[] args) {
//        ComponentsFactory factory = new ComponentsFactory();
//        Message message = factory.getMessageComponent();
//        System.out.println(message.getText());

//        System.out.println("Классика");
        MessageByeImpl messageBye = new MessageByeImpl("Zakir");
//        System.out.println(messageBye.getText());

//        System.out.println("\nРефлексия");
//        ComponentsFactory factory=ComponentsFactory.getInstance();
//        Message message=factory.getMessageComponent();
//        System.out.println(message.getText());

        System.err.println("Ошибка\nКлассика");
        MessageErrorOutImpl messageErrorOut=new MessageErrorOutImpl(messageBye);
        messageErrorOut.render();

        System.err.println("\nРефлексия");
        ComponentsFactory factory= ComponentsFactory.getInstance();
        MessageRenderer messageRenderer=factory.getMessageRendererComponent();
        messageRenderer.render();


//        ComponentsFactory factory1 = ComponentsFactory.getInstance();
//        MessageRenderer messageRenderer=factory1.getMessageRendererComponent();
//        messageRenderer.render();
    }
}
