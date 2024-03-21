package Part7;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupExample2 {
    public static void main(String[] args) throws IOException {
//        원하는 날짜 가져오기
//        String url = "https://sum.su.or.kr:8888/bible/today?base_de=2023-03-23";

        String url = "http://www.holybible.or.kr/B_HDB/cgi/bibleftxt.php?VR=10&VL=4&CN=6&PN=24&GB=1#b_021";
        try {
            Document document = Jsoup.connect(url).get();


            Elements numElements = document.select(".tk4br");
            Elements infoElements = document.select(".tk4l");

            for (int i=0; i<numElements.size();i++){
                System.out.println(numElements.get(i).text()+":"+infoElements.get(i).text());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}