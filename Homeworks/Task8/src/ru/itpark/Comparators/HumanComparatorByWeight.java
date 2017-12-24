package ru.itpark.Comparators;

import ru.itpark.Human;

/**
 * Created by Ofice on 15.11.2017.
 */
public class HumanComparatorByWeight implements HumanComparator {
    @Override
     public int compare (Human a, Human b){
        return a.getWeigth()-b.getWeigth();
    }
}
