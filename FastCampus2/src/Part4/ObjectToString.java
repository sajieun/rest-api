package Part4;

import Part4.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board br = new Board();
        br.setTitle("게시글 입니다.");
        System.out.println(br.getTitle());
        System.out.println(br);
    }
}
