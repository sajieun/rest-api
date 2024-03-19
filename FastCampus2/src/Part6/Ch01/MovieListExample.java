package Part6.Ch01;

import Part6.Ch01.model.Movie;

import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        ArrayList<Movie> movieList = new ArrayList<>();

        Movie movie1 = new Movie("괴물","봉준호",2006,"한국");
        movieList.add(movie1);
        Movie movie2 = new Movie("기생충","봉준호",2019,"한국");
        movieList.add(movie2);
        Movie movie3 = new Movie("완벽한 타인","이재규",2018,"한국");
        movieList.add(movie3);

        System.out.println("---------------------------------");
        System.out.println("영화제목             감독        개봉년도   국가");
        for (Movie movie : movieList){
            System.out.printf("|%-16s|%-8s|%6d|%-6s|\n",movie.getTitle(),movie.getDirector(),movie.getYear(),movie.getCounty());
        }

        String searchTitle = "기생충";
        for (Movie m : movieList){
            if (m.getTitle().equals(searchTitle)){
                System.out.println(m);
                System.out.println(m.getTitle());
                System.out.println(m.getDirector());
                System.out.println(m.getYear());
                System.out.println(m.getCounty());
                break;
            }
        }

    }
}
