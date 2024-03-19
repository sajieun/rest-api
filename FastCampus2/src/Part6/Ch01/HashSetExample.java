package Part6.Ch01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        System.out.println("Setsize:"+set.size());

        for (String str : set){
            System.out.println(str);
        }
//         삭제
        set.remove("Banana");

//        체리가 있느지 확인
        boolean contains = set.contains("Cherry");
        System.out.println("Set contains Cherry?"+contains);

//        셋 안에 있는거 다 비워주기
        set.clear();

//        셋 안에 아무것도 없냐 물어보는 코드
        boolean empty = set.isEmpty();
        System.out.println("Set is Empty?"+empty);

    }
}
