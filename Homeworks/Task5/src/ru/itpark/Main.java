package ru.itpark;

import java.io.IOException;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException { // IOException - это оператор, требующийся для обработки ошибок.
        Document document = new Document();
        Scanner in = new Scanner(System.in);


        while (true) {
            Menu.showMenu();

            System.out.println("\n What you want?");

            int command = in.nextInt();

            switch (command) {

                case 1: {
                    document.showDocument();
                }
                break;

                case 2: {
                    if (document.count == document.lines.length) {
                        System.out.println("No memory");
                        break;
                    }
                    System.out.println("Enter new line:");
                    String newLine = in.next();
                    document.addLineToBegin(newLine);
                }
                break;

                case 3: {
                    if (document.count == document.lines.length) {
                        System.out.println("No memory");
                        break;
                    }
                    System.out.println("Enter new line:");
                    String newLine = in.next();
                    document.addLineToEnd(newLine);
                }
                break;

                case 4: {
                    if (document.count == 0) {
                        System.out.println("Massive is empty");
                        break;
                    }
                    System.out.println("Which line need delete?");
                    int deleteNumber = in.nextInt();
                    boolean error = document.antibugForNumberOfElements(deleteNumber); // Проверею не вышел ли я за пределы массива!!!
                    if (error) {
                        break;
                    } else {
                        boolean erroEl = document.antibugForElementsOfArray(deleteNumber); // Проверяю пуст ли сам элемент массива!!!
                        if (erroEl) {
                            break;
                        } else {
                            document.deleteLine(deleteNumber);
                        }
                    }
                }
                break;

                case 5: {
                    if (document.count == 0) {
                        System.out.println("Massive is empty");
                        break;
                    }
                    System.out.println("Which line need to change?");
                    int changeLine = in.nextInt();
                    boolean error = document.antibugForNumberOfElements(changeLine);
                    if (error) {
                        break;
                    } else {
                        boolean errorEl = document.antibugForElementsOfArray(changeLine);
                        if (errorEl) {
                            break;
                        } else {
                            String newLine = in.next();
                            document.changeLine(changeLine, newLine);
                        }
                    }
                    break;
                }



//                case 6: {
//                    if (document.count == 0) {
//                        System.out.println("Massive is empty");
//                        break;
//                    }
//                    System.out.println("Which line need to change?");
//                    int clearLine = in.nextInt();
//                    boolean error = document.antibugForNumberOfElements(clearLine);
//                    if (error) {
//                        break;
//                    } else {
//                        boolean errorEl = document.antibugForElementsOfArray(clearLine);
//                        if (errorEl) {
//                            break;
//                        } else {
//                            document.clearLine(clearLine);
//                        }
//                    }
//                    break;
//                }

                case 7:{

                }
                break;

                default:
                    System.out.println("Command is not defined!!!");
            }
        }
    }
}

