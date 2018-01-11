package ru.itpark;

public class Main {

    public static void main(String[] args) {
        TextViewer viewer = new TextViewer();
        viewer.setText("Кек Лол Азазаз 1337;; Азино777");
//        viewer.addTask(new LettersTask(viewer));
        viewer.addTask(new DigitsTask(viewer));
//        viewer.addTask(new SymbolTask(viewer));
        viewer.process();
//        System.out.println("\n");

//        LettersTask lettersTask=new LettersTask(viewer);
//        DigitsTask digitsTask=new DigitsTask(viewer);
//        SymbolTask symbolTask=new SymbolTask(viewer);
//
//        lettersTask.start();
//        symbolTask.start();
//        digitsTask.start();

//        lettersTask.run();
//        digitsTask.run();
//        symbolTask.run();
    }
}
