package ru.itpark.Sorters;

import ru.itpark.Comparators.HumanComparator;
import ru.itpark.Human;

/**
 * Created by Ofice on 15.11.2017.
 */
public interface HumanSorter {
    void sort(HumanComparator comparator, Human humans[]);
}
