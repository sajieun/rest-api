package Part6.Ch01;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String ,Integer> map = new HashMap<>();

        map.put("jin",7);
        map.put("jink",6);
        map.put("jini",0);
        map.put("jie",34);

//        데이터 조회
        System.out.println(map.get("jin"));
        System.out.println(map.get("jie"));


//    데이터 수정
        map.put("jin",10);
        System.out.println(map.get("jin"));

//        데이터 삭제
        map.remove("jini");
        System.out.println(map.get("jini"));

        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }


}
