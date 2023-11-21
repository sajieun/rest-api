package Part3.ClassDTO;

import Part3.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        MovieVO mv= new MovieVO();
        MovieVO mv1= new MovieVO("lala land","2024.10.11","me","lomance",150,20);
        System.out.println(mv1);
    }
}
