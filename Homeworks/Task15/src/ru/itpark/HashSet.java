package ru.itpark;


public class HashSet<E> {
    private HashMap<E, Object> map;
    Object obj = new Object();

    public HashSet() {
        map = new HashMap<>();
    }

    public void add (E e) {
        map.put(e, obj);
    }

    public void iterator() {
        map.iteratorOfBuckets();
    }
}
