package ru.itpark.Sorters;

import ru.itpark.Comparators.HumanComparator;
import ru.itpark.Human;

public class HumanSorterSelection implements HumanSorter {

    @Override
    public void sort(HumanComparator comparator, Human humans[]) {
        for (int i = 0; i < humans.length - 1; i++) {
            Human min = humans[i];
            int indOfMin = i;
            for (int j = i + 1; j < humans.length; j++) {
                if (comparator.compare(humans[j], min) < 0) {
                    min = humans[j];
                    indOfMin = j;
                }
            }
            Human t = humans[i];
            humans[i]=min;
            humans[indOfMin]=t;
        }
    }
}
