package Part6.Ch01;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("orange");

        System.out.println("1"+list.get(0));
        System.out.println("2"+list.get(1));
        System.out.println("3"+list.get(2));
        System.out.println("4"+list.get(3));

        list.remove(0); // 삭제
        list.set(2,"banana"); // 수정

        for (String str : list){
            System.out.print(" "+str);
        }
    }
}
