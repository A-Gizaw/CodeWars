import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    public String encode(String word){
        String encoded = "";
        Map<Character, Integer> count = new HashMap<>();

        char[] charArray = word.toLowerCase().toCharArray();

        for(char c:charArray){
            if (count.putIfAbsent(c,1) != null) count.put(c,count.get(c) + 1);
        }

        for (char c:charArray){
            encoded = encoded.concat(count.get(c) != 1?")":"(");
        }

        return encoded;
    }
}
