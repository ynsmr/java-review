import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Sergio");
        map.put(2,"Moses");
        System.out.println("map.get(1) = " + map.get(1));
        System.out.println(findFirstNonRepeating("deo java developer"));

    }

    public static Character findFirstNonRepeating(String str){
        Map<Character, Integer> map = new HashMap<>();
        //For counting chars
        int count;
        //Counting chars and putting value in hashmap
        for (Character ch: str.toCharArray()){
            if(map.containsKey(ch)){
                count = map.get(ch);
                map.put(ch, count+1);
            }else {
                map.put(ch,1);
            }
        }

        // Starting from string, check if the count equals 1
        for (Character ch: str.toCharArray()){
            if(map.get(ch)==1) return ch;
        }

        return Character.MIN_VALUE;
    }
}
