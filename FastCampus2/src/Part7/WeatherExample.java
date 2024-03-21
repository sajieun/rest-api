package Part7;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
    public static void main(String[] args) {
//        https://openweathermap.org/current 사이트
        String apiKey = ""; // 나중에 키 넣으면 됨
        String city="seoul";
//      &units=metric 우리나라 온도로 변경해줌
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid="+ apiKey+ "&units=metric";

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept","application/json"); // Json형식으로 받겠다.

            int responseCode = connection.getResponseCode(); // 200이 정상적인 응답이다.
            System.out.println("Response Code:"+responseCode);

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String inputLine; // 변수생성
            StringBuilder content = new StringBuilder();
            while ((inputLine=in.readLine()) != null){
                content.append(inputLine);
            }
            in.close();
//            Gson 라이브러리를 사용하여 온도를 추출
            JsonObject weatherData = JsonParser.parseString(content.toString()).getAsJsonObject();
            JsonObject mainData = weatherData.getAsJsonObject("main");
            double temp = mainData.get("temp").getAsDouble();

            System.out.println("seoul " + temp +"°C");

            connection.disconnect();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
