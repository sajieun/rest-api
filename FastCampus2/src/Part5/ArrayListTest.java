package Part5;

import Part5.model.BookDTO;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<BookDTO> list = new ArrayList<>(); // 기본 크기는 10
        list.add(new BookDTO("자바",3000,"ㅎㅎ","ㅛㅛ"));
        list.add(new BookDTO("자바2",3000,"ㅎㅎ","ㅛㅛ"));
        list.add(new BookDTO("자바3",3000,"ㅎㅎ","ㅛㅛ"));

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
