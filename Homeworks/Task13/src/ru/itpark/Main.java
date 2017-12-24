package ru.itpark;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException, NullPointerException {
        String url = "jdbc:postgresql://localhost:5432/belyakov_db";
        String user = "postgres";
        String password = "rfvbkm291098";
        Connection connection = DriverManager.getConnection(url, user, password);

        Scanner in = new Scanner(System.in);

        Statement statement;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        while (true) {
            Menu.showMenu();
            int command = in.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Введите имя:");
                    String name = in.next();
                    System.out.println("Введите возраст:");
                    int age = in.nextInt();
                    System.out.println("Введите рост:");
                    int height = in.nextInt();
                    preparedStatement = connection.prepareStatement("INSERT INTO owner (age,height,name) VALUES (?,?,?)");
                    preparedStatement.setInt(1, age);
                    preparedStatement.setInt(2, height);
                    preparedStatement.setString(3, name);
                    preparedStatement.execute();
                    preparedStatement.close();
                    break;
                case 2:
                    System.out.println("Введите модель машины:");
                    String model = in.next();
                    System.out.println("Введите госномер машины:");
                    String number = in.next();
                    System.out.println("Введите цвет машины:");
                    String color = in.next();
                    one:
                    {
                        System.out.println("У машины есть хозяин?(Да/Нет)");
                        String answer = in.next();
                        int owner_id = 0;
                        if (answer.equals("Да")) {
                        System.out.println("Введите номер хозяина машины:");
                        owner_id = in.nextInt();
                            preparedStatement = connection.prepareStatement("INSERT INTO car (model, number,color, owner_id) VALUES (?,?,?,?)");
                            preparedStatement.setString(1, model);
                            preparedStatement.setString(2, number);
                            preparedStatement.setString(3, color);
                            preparedStatement.setInt(4, owner_id);
                            preparedStatement.execute();
                            preparedStatement.close();
                            break;
                        } else if (answer.equals("Нет")) {
                            preparedStatement = connection.prepareStatement("INSERT INTO car (model, number,color) VALUES (?,?,?)");
                            preparedStatement.setString(1, model);
                            preparedStatement.setString(2, number);
                            preparedStatement.setString(3, color);
                            preparedStatement.execute();
                            preparedStatement.close();

                        } else {
                            System.out.println("Команда не верна");
                            break one;
                        }
                    }
                    break;
                case 3:
                    statement = connection.createStatement();
                    resultSet = statement.executeQuery("SELECT (name, model) FROM owner\n" +
                            "JOIN car ON car.owner_id = owner.id;");
                    while(resultSet.next()){
                        System.out.println( resultSet.getString(1));
                    }
                    statement.close();
                    System.out.println();
                    break;
                case 4:
                    statement = connection.createStatement();
                    resultSet = statement.executeQuery("SELECT * FROM car");
                    while (resultSet.next()){
                        System.out.println(resultSet.getString("model")+ " " + resultSet.getString("number")+ " "
                                + resultSet.getString("color")+" "+resultSet.getInt("owner_id"));
                    }
                    statement.close();
                    System.out.println();
                    break;
//                case 5:
//                    System.out.println("Введите id владельца");
//                    int owner_id=in.nextInt();
//                    statement = connection.createStatement();
//                    resultSet= statement.executeQuery("SELECT (model) FROM car WHERE owner_id=(?)");
//                    break;
                case 6:
                    statement =connection.createStatement();
                    resultSet=statement.executeQuery("SELECT model, color FROM  car");
                    while (resultSet.next()){
                        System.out.println(resultSet.getString("model")+ " "+ resultSet.getString("color"));
                    }
                    statement.close();
                    System.out.println();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Команда не верна");
                    break;
            }

        }


    }
}
