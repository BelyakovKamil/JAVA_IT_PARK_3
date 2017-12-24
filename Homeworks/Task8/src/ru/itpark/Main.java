package ru.itpark;

import ru.itpark.Comparators.HumanComparator;
import ru.itpark.Comparators.HumanComparatorByAge;
import ru.itpark.Comparators.HumanComparatorByHeight;
import ru.itpark.Comparators.HumanComparatorByWeight;
import ru.itpark.Sorters.HumanSorter;
import ru.itpark.Sorters.HumanSorterBubble;
import ru.itpark.Sorters.HumanSorterSelection;

public class Main {

    public static void main(String[] args) {
        Human h1 = new Human("Андрей", 18, 178, 62);
        Human h2 = new Human("Василий", 25, 173, 82);
        Human h3 = new Human("Илья", 32, 169, 96);
        Human h4 = new Human("Иван", 16, 191, 61);
        Human h5 = new Human("Петр", 52, 189, 85);

        Human humans[] = {h1, h2, h3, h4, h5};

        HumanSorter sorterBubble = new HumanSorterBubble();
        HumanComparator comparatorByAge = new HumanComparatorByAge();
        HumanComparator comparatorByWeight = new HumanComparatorByWeight();
        HumanComparator comparatorByHeight = new HumanComparatorByHeight();

        sorterBubble.sort(comparatorByAge, humans);
        System.out.println("Сортировка ПУЗЫРЬКОМ\n");
        System.out.println("Сортировка по возрасту");
        for (Human h : humans) {
            System.out.println(h);
        }

        System.out.println();

        sorterBubble.sort(comparatorByWeight, humans);
        System.out.println("Сортировка по весу");
        for (Human h : humans) {
            System.out.println(h);
        }

        System.out.println();

        sorterBubble.sort(comparatorByHeight, humans);
        System.out.println("Сортировка по росту");
        for (Human h : humans) {
            System.out.println(h);
        }


        HumanSorter sorterSelection = new HumanSorterSelection();

     System.out.println("\nСортировка ВЫБОРОМ\n");
        sorterSelection.sort(comparatorByAge, humans);
        System.out.println("По возрасту");
        for (Human h: humans){
            System.out.println(h);
        }
        System.out.println();

        sorterSelection.sort(comparatorByWeight, humans);
        System.out.println("По весу");
        for (Human h: humans){
            System.out.println(h);
        }
        System.out.println();

        sorterSelection.sort(comparatorByHeight, humans);
        System.out.println("По росту");
        for (Human h: humans){
            System.out.println(h);
        }
        System.out.println();


    }
}
