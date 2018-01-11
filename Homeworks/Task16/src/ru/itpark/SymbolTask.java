package ru.itpark;

public class SymbolTask extends Thread {
    private String text;

    public SymbolTask(TextViewer viewer) {
        this.text = viewer.getText();
    }

    @Override
    public void run() {
        setName("SymbolTask");
        System.out.println(getName()+" запущен");
        for (int i = 0; i < text.length(); i++) {
            int currentByte = text.charAt(i);
            if (currentByte >= 33 && currentByte <= 47 || currentByte >= 58 && currentByte <= 64) {
                System.out.print(" Символ: " + (char) currentByte + " ");
            }
        }
        System.out.println();
        System.out.println(getName()+" завершен");
    }
}