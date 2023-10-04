package ObjectArray;

import ObjectClass.Movie;

public class ObjectArrayExam {
    public static void main(String[] args) {
        Movie[] m = new Movie[3];

        m[0] = new Movie();
        m[0].name="about time";
        m[0].open="2011.4.5";
        m[0].bestmember="me";
        m[0].genre="romance";
        m[0].time=124;
        m[0].age=17;

        m[1] = new Movie();
        m[1].name="about time";
        m[1].open="2011.4.5";
        m[1].bestmember="me";
        m[1].genre="romance";
        m[1].time=124;
        m[1].age=17;

        m[2] = new Movie();
        m[2].name="about time";
        m[2].open="2011.4.5";
        m[2].bestmember="me";
        m[2].genre="romance";
        m[2].time=124;
        m[2].age=17;

        for (int i=0;i<m.length;i++){
            System.out.println(m[i].name+"\t"+m[i].open+"\t"+m[i].bestmember+"\t"+m[i].genre+"\t"+m[i].time+"\t"+m[i].age+"\t");
        }
    }
}
