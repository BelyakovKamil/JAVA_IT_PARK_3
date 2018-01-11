package ru.itpark;

public class DigitsTask extends Thread {
    private String text;

    public DigitsTask(TextViewer viewer) {
        this.text = viewer.getText();
    }

    @Override
    public void run() {
        setName("DigitsTask");
        System.out.println(getName()+" запущен");
        for (int i = 0; i < text.length(); i++) {
            int currentByte = text.charAt(i);
            if (currentByte >= '0' && currentByte <= '9') {
                System.out.print(" Цифра: " + (char) currentByte + " ");
            }
        }
        System.out.println(getName()+" завершен");

    }
}
