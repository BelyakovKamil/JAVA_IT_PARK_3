package ru.itpark;

public class Main {

    public static void main(String[] args) {
        char a[] = {'a', 'e', 'f', 'k', 'x', 'i', 'z', 'j', 'q', 'c', 'b'};
        int i;
        System.out.println("Исходный массив: ");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

        QuickSort.qsort(a);

        System.out.println("Отсортированный массив: ");
        for (i=0; i< a.length; i++){
            System.out.print(a[i]);
        }
    }
}
