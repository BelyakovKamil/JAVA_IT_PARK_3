package ru.itpark;


public class LinkedList implements List {

    private Node head;
    private int count;

    private static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private class LinkedListIterator implements Iterator {
        private Node currentNode;

        LinkedListIterator() {
            currentNode = head;
        }

        @Override
        public int next() {
            int element = currentNode.value;
            currentNode = currentNode.next;
            return element;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }

    @Override
    public void addToBegin(int element) {
        Node node = new Node(element);
        if (head != null) {
            node.next = head;
        }
        head = node;
        count++;
    }

    @Override
    public void addToEnd(int element) {
        Node node = new Node(element);
        Node tail = null;
        if (head == null) {
            head = node;
        } else {
            Node current=head;
            Node next= current.next;
            while(next.next != null){
                current=next;
                next=current.next;
            }
           current.next.next=node;
//            LinkedListIterator iterator = new LinkedListIterator();
//            while (iterator.hasNext()) {
//                tail = iterator.currentNode;
//                iterator.next();
//            }
//            tail.next = node;
        }
        count++;
    }

    @Override
    public int amountOfElements() {
        System.out.println("Количество элементов в списке " + count);
        return count;
    }

    @Override
    public void reverse() {
        Node temp = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = temp;
            temp = current;
            current = next;
        }
        head = temp;
    }

    @Override
    public void deleteFromBegin() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("Список пуст!!!");
        }
        count--;

    }

    @Override
    public void deleteFromEnd() {
        if (count !=0) {
            if (head.next != null) {
                Node current = head;
                Node next = current.next;
                while (next.next != null) {
                    current = next;
                    next = current.next;
                }
                current.next = null;
            } else {
                head = null;
            }
            count--;
        } else {
            System.out.println("Список пуст");
        }
    }

    @Override
    public void find(int variable) {

    }
}
