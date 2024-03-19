package Part6.Ch02;

import Part6.Ch01.model.Movie;

public class GenericTest {
    public static void main(String[] args) {
//        ObjectArr<String> array = new ObjectArr<>(5);
//        array.set(0,"Hello");
//        array.set(1,"Hello2");
//        array.set(2,"Hello3");
//        array.set(3,"Hello4");
//
//        for(int i=0;i< array.size();i++){
//            System.out.println(array.get(i));
//        }
        ObjectArr<Movie> book = new ObjectArr<>(5);
        book.set(0,new Movie("괴물","봉준호",2006,"한국"));
        book.set(1,new Movie("기생충","봉준호",2019,"한국"));
        book.set(2,new Movie("완벽한 타인","이재규",2018,"한국"));

        for (int i=0;i< book.size();i++){
            System.out.println(book.get(i));
        }


    }
}
