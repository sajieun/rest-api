package Part6.Ch01.model;

public class Movie {
    String title = "";
    String director = "";
    int year = 0;
    String county="";

    public Movie(String title, String director, int year, String county) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.county = county;
    }

    public Movie(){};

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", county='" + county + '\'' +
                '}';
    }
}
