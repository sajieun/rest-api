package Part4.poly;

public class Board {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "게시글 입니다.";
    }

    private String title;
}
