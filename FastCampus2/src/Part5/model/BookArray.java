package Part5.model;

import java.util.Arrays;

public class BookArray {

    private static final int DEFAULT_CAPACITY = 5;
    private BookDTO[] elements;
    private int size = 0;

    public BookArray(){
        elements = new BookDTO[DEFAULT_CAPACITY];
    }

    public int Size(){
        return size;
    }

    public BookDTO get(int index){
        if(index < 0 || index>= size){

        }
        return elements[index];
    }

    public void add(BookDTO element){
        if (size==elements.length){
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public void ensureCapacity(){
        int newCapacity = elements.length*2;
        Arrays.copyOf(elements, newCapacity);
    }

}
