package Part5.model;

import java.util.Arrays;

public class IntArray {
    // final 은 값을 절대 바꿀 수 없음
    private final int DEFAULT_CAPACITY=5;

    private int[] elements;
    private int size =0;

    public IntArray(){
        elements= new int[DEFAULT_CAPACITY];
    }
    public void add(int element){
        if (size==elements.length){
            ensureCapacity();
        }
        elements[size++]=element;
    }

    public int get(int index){
        return elements[index];
    }
    // 원소의 개수를 넘겨주는 동작
    public int size(){
        return size;
    }

    public void ensureCapacity(){
        int newCapacity = elements.length*2;
        Arrays.copyOf(elements, newCapacity);
    }
}
