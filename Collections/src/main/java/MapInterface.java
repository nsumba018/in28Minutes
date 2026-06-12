import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        String str ="It has never happened before";

        Map<Character, Integer> occurences = new HashMap<>();

        char[] characters = str.toCharArray();
        for(char character: characters){
            Integer integer = occurences.get(character);
            if(integer == null){
                occurences.put(character, 1);
            }else {
                occurences.put(character, integer + 1);
            }
        }
        System.out.println(occurences);
    }
}
