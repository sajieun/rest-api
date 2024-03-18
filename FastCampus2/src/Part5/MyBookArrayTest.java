package Part5;

import Part5.model.BookArray;
import Part5.model.BookDTO;

public class MyBookArrayTest {
    public static void main(String[] args) {
        BookArray list = new BookArray();
        list.add(new BookDTO("자바",3000,"ㅎㅎ","ㅛㅛ"));
        list.add(new BookDTO("자바2",3000,"ㅎㅎ","ㅛㅛ"));
        list.add(new BookDTO("자바3",3000,"ㅎㅎ","ㅛㅛ"));

        BookDTO vo = list.get(0);
        System.out.println(vo);

        for (int i=0;i< list.Size();i++){
            System.out.println(list.get(i));
        }

    }
}
