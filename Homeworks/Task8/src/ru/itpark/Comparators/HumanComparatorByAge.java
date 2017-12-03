package ru.itpark.Comparators;


import ru.itpark.Human;

public class HumanComparatorByAge implements HumanComparator {

    @Override
    public int compare(Human a, Human b) {
        return a.getAge() - b.getAge();
    }
}
