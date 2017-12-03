package ru.itpark;

public class Main {

    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//        list.addToBegin(10);
//        list.addToBegin(12);
//        arrayList.addToBegin(98);
//        arrayList.addToBegin(6788);
//        arrayList.addToBegin(967);
//        arrayList.addToBegin(5);
//        arrayList.addByIndex(7,765); - НЕ РАБОТАЕТ!!
//        arrayList.reverse();
//        arrayList.find(14);
//        arrayList.find(98);
//        arrayList.find(1000);
//        arrayList.find(5);
//        arrayList.amountOfElements();
//        arrayList.deleteFromBegin();
//        arrayList.deleteFromEnd();
//        arrayList.addToEnd(13);
//        arrayList.addToEnd(19);
//	arrayList.addByIndex(5, 777);

//        Iterator arrayListIterator = arrayList.iterator();
//
//        while (arrayListIterator.hasNext()) {
//            System.out.println(arrayListIterator.next());
//        }


//        System.out.println("Развернутый массив");
//        ArrayList arrayList1 = new ArrayList();
//        arrayList1.addToBegin(10);
//        arrayList1.addToBegin(12);
//        arrayList1.addToBegin(98);
//        arrayList1.addToBegin(6788);
//        arrayList1.addToBegin(967);
//        arrayList1.addToBegin(5);
//
//        System.out.println();
//
//        arrayList1.reverse();
//
//        Iterator arrayListIterator1 = arrayList1.iterator();
//
//        while (arrayListIterator1.hasNext()) {
//            System.out.println(arrayListIterator1.next());
//        }
//----------------------------------------------------------------------


        LinkedList linkedList = new LinkedList();

        linkedList.addToBegin(53);
        linkedList.addToBegin(84);
        linkedList.addToBegin(96);
        linkedList.addToEnd(65412);
        linkedList.reverse();
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
