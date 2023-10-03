package ObjectArray;


import ObjectClass.Book;

public class ObjectArrayTest {
    public static void main(String[] args) {
        Book[] b = new Book[3];
        b[0]=new Book(); // 이거 추가해주는거 잊지말기!
        b[0].title="Python";
        b[0].price=666;
        b[0].company="sodoc";
        b[0].author="kongzu";
        b[0].page=7;
        b[0].isbn="787";

        b[1]=new Book();
        b[1].title="Python2";
        b[1].price=6662;
        b[1].company="sodoc2";
        b[1].author="kongzu2";
        b[1].page=72;
        b[1].isbn="7872";

        b[2]=new Book();
        b[2].title="Python3";
        b[2].price=6663;
        b[2].company="sodoc3";
        b[2].author="kongzu3";
        b[2].page=73;
        b[2].isbn="7873";

        for (int i = 0;i<b.length;i++){
            System.out.println(b[i].title+"\t"+b[i].price+"\t"+b[i].company+"\t"+b[i].author+"\t"+b[i].page+"\t"+b[i].isbn+"\t");
        }

    }
}
