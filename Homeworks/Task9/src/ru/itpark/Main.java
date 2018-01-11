package ru.itpark;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addToBegin(53);
        linkedList.addToBegin(84);
        linkedList.addToBegin(96);
        linkedList.addToEnd(65412);
        linkedList.addToEnd(62);
//        linkedList.reverse();
//        linkedList.deleteFromEnd();
//        linkedList.addToEnd(85);
//        linkedList.deleteFromBegin();
//        linkedList.amountOfElements();
//        linkedList.reverse();
        Iterator linkedListIterator = linkedList.iterator();

        while (linkedListIterator.hasNext()){
            System.out.println(linkedListIterator.next());
        }
    }
}
