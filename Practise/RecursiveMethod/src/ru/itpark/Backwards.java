package ru.itpark;

/**
 * Created by Kamil on 03.12.2017.
 */
public class Backwards {
    String str;

    Backwards(String s) {
        str = s;
    }

    void backwards(int idx) {
        if (idx != str.length() - 1) {
            backwards(idx + 1);
        }
        System.out.print(str.charAt(idx));
    }
}
