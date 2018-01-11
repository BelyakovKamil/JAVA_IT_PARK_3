package ru.itpark;




public class ArrayList implements List {
    private static final int MAX_SIZE = 10;
    private int elements[];
    private int count;

    public ArrayList() {
        this.elements = new int[MAX_SIZE];
        this.count = 0;
    }

    @Override
    public void addToBegin(int element) {
        count++;
        if (count < MAX_SIZE) {
            for (int i = count - 1; i > 0; i--) {
                elements[i] = elements[i - 1];
            }
            elements[0] = element;

        } else {
            System.err.println("Нет места");
        }
    }

    @Override
    public void addToEnd(int element) {
        if (count < MAX_SIZE) {
            elements[count] = element;
            count++;
        } else {
            System.err.println("Нет места");
        }
    }

    @Override
    public int amountOfElements() {
        System.out.println("Количесвто элементов в массиве " + count);
        return count;
    }

    @Override
    public void reverse (){
        for (int i=0; i<count/2;i++){
            int temp=elements[i];
            elements[i]=elements[count-(i+1)];
            elements[count-(i+1)]=temp;
        }
    }

    @Override
    public void deleteFromBegin() {
        count--;
        if (count != 0) {
            for (int i = 0; i < count; i++) {
                elements[i] = elements[i + 1];

            }
        } else {
            System.err.println("Массив пуст");
        }

    }

    @Override
    public void deleteFromEnd() {

        if (count != 0) {
            count--;
        } else {
            System.err.println("Массив пуст");
        }

    }

    @Override
    public void find(int variable) {
        boolean ok=true;
        int k=0;
        if (count != 0) {
            for (int i = 0; i < count; i++) {
                if (elements[i] == variable) {
                    System.out.println("Элемент " + variable + " аходится под номером " + (i+1));
                    ok=true;
                    k=i+1;
                    return;
                } else {
                    ok=false;
                }
            }
        } else{
            System.err.println("Массив пуст!!!");
        }
        if(ok){
            System.out.println("Элемент " + variable + " аходится под номером " + k);
        } else System.err.println("Такого элемента \"" + variable + "\" в массиве нет!!!");
        return;
    }

//    @Override
//    public void addByIndex(int index, int element) {
//        if (index >= count) {
//            if (count < MAX_SIZE && Math.abs(index) < MAX_SIZE) {
//                for(int i=0; i<index; i++){
//
//                }
//                elements[index] = element;
//            } else {
//                if (Math.abs(index) > MAX_SIZE) {
//                    System.err.println("Проверьте значения!!!");
//                } else {
//                    System.err.println("Нет места!!!");
//                }
//            }
//        } else {
//            System.out.println("Данный элемент уже заполнен");
//        }
//    }




    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator {
        private int current;

        public ArrayListIterator() {
            current = 0;
        }

        @Override
        public int next() {
            int element = elements[current];
            current++;
            return element;
        }

        @Override
        public boolean hasNext() {
            return current < count;
        }
    }
}
