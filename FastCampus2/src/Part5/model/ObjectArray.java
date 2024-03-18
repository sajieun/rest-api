package Part5.model;

import java.util.Arrays;

public class ObjectArray {
    // final 은 값을 절대 바꿀 수 없음
    private final int DEFAULT_CAPACITY=5;

    private Object[] elements; //다형성 배열
    private int size =0;

    public ObjectArray(){
        elements= new Object[DEFAULT_CAPACITY];
    }
    public void add(Object element){
        if (size==elements.length){
            ensureCapacity();
        }
        elements[size++]=element;
    }

    public Object get(int index){
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
