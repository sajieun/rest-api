package Part6.Ch02;

import Part6.Ch01.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
    public static void main(String[] args) {
//        이렇게 하면 안전성이 조금 떨어짐
//        List<Movie> list = new ArrayList<>(5); 안전성을 추구할거면 이렇게 지정해주는게 좋음
        List list = new ArrayList<>(5); //Obejct여서 어느 타입이든 넣어도됨
        list.add(0,"Hello");
        list.add("Hello");
        list.add(new Movie("완벽한 타인","이재규",2018,"한국"));
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}
