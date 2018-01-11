package ru.itpark;

public class LettersTask extends Thread {
    private String text;

    public LettersTask(TextViewer viewer) {
        this.text = viewer.getText();
    }

    @Override
    public void run() {
        setName("LettersTask");
        System.out.println(getName()+" запущен");
        for (int i = 0; i < text.length(); i++) {
            int currentByte = text.charAt(i);
            if (currentByte >= 'A' && currentByte <= 'Z' || currentByte >= 'a' && currentByte <= 'z'
                    || currentByte >= 'А' && currentByte <= 'Я' || currentByte >= 'а' && currentByte <= 'я') {
                System.out.print(" Буква: " + (char) currentByte + " ");
            }
        }
        System.out.println(getName()+" завершен");
    }
}
