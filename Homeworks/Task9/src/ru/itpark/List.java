package ru.itpark;

public interface List {
    void addToBegin(int element);
    void addToEnd(int element);
    int amountOfElements();
    void reverse();
    void deleteFromBegin();
    void deleteFromEnd();
    void find(int variable);
//    void addByIndex(int index, int element);
//    void deleteByIndex(int index);
//    void deleteyElement();
    Iterator iterator();


}
