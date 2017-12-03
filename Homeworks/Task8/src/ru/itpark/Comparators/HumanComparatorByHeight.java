package ru.itpark.Comparators;

import ru.itpark.Human;


public class HumanComparatorByHeight implements HumanComparator {
    @Override
    public int compare(Human a, Human b) {
    return a.getHeight()-b.getHeight();
    }
}
