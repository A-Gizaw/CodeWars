import java.util.stream.Collectors;

public class DuplicateEncoderImproved {
    static String encode(String word){
        return word.toLowerCase()
                .chars()
                .mapToObj(i -> String.valueOf((char)i))
                .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
                .collect(Collectors.joining());
    }
}