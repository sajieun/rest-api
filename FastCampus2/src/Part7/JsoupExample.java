package Part7;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupExample {
    public static void main(String[] args) throws IOException {
//        원하는 날짜 가져오기
//        String url = "https://sum.su.or.kr:8888/bible/today?base_de=2023-03-23";

        String url = "https://sum.su.or.kr:8888/bible/today";
        try {
            Document document = Jsoup.connect(url).get();

            Element bibleText = document.getElementById("bible_text");
            Element bibleInfoBox = document.getElementById("bibleinfo_box");

            System.out.println(bibleText.text());
            System.out.println(bibleInfoBox.text());
            System.out.println();

            Elements numElements = document.select(".num");
            Elements infoElements = document.select(".info");

            for (int i=0; i<numElements.size();i++){
                System.out.println(numElements.get(i).text()+":"+infoElements.get(i).text());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}