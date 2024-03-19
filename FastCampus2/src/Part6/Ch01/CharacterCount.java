package Part6.Ch01;

import java.util.HashMap;

// key 는 중복되면 절대 안됨 but value 는 중복 가능
public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello,World!";
        HashMap<Character,Integer> map = new HashMap<>();
        char[] strArray = str.toCharArray();

        for (char c : strArray){
//           if c가 중복된 경우 else 중복이 안된 경우
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else map.put(c,1);
        }

        for (char c : map.keySet()){
            System.out.println(c+ ":"+map.get(c));
        }
    }
}
