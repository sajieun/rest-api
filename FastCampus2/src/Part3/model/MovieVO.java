package Part3.model;
//      v.name="about time";
//              v.open="2011.4.5";
//        v.bestmember="me";
//        v.genre="romance";
//        v.time=124;
//        v.age=17;
public class MovieVO {
    private String title;
    private String open;
    private String bestmember;
    private String ganre;
    private int time;
    private int age;

    public MovieVO(){

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public void setBestmember(String bestmember) {
        this.bestmember = bestmember;
    }

    public void setGanre(String ganre) {
        this.ganre = ganre;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public String getOpen() {
        return open;
    }

    public String getBestmember() {
        return bestmember;
    }

    public String getGanre() {
        return ganre;
    }

    public int getTime() {
        return time;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", open='" + open + '\'' +
                ", bestmember='" + bestmember + '\'' +
                ", ganre='" + ganre + '\'' +
                ", time=" + time +
                ", age=" + age +
                '}';
    }

    public MovieVO(String title, String open, String bestmember, String ganre, int time
    , int age){
        this.title=title;
        this.open=open;
        this.bestmember=bestmember;
        this.time=time;
        this.age=age;
    }

}
