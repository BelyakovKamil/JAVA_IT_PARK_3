package ru.itpark;

/**
 * Created by Ofice on 02.12.2017.
 */
public class MessageHelloImpl implements Message {
    private String text;

    public MessageHelloImpl(String text){
        this.text="Hello, "+ text;
    }

    @Override
    public String getText(){
        return text;
    }
}
