package ru.itpark;

import java.rmi.MarshalException;

/**
 * Created by Ofice on 02.12.2017.
 */
public class MessageErrorOutImpl implements MessageRenderer {
    private Message message;

    public MessageErrorOutImpl(Message message){
        this.message=message;
    }

    @Override
    public void render() {
        System.err.println(message.getText());
    }
}
