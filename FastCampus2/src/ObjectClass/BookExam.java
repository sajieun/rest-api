package ObjectClass;

public class BookExam {
    public static void main(String[] args) {
        int a;
        a=10;

        Book b = new Book();
        b.title="Python";
        b.price=666;
        b.company="sodoc";
        b.author="kongzu";
        b.page=7;
        b.isbn="787";

        System.out.println(b.page);
    }
}
