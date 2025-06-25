package q6.duplicateencoder;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateEncoder {
    static String encode(String word){
        Map<Character, Long> mapping = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));


        return word.chars()
                .mapToObj(c -> (char) c)
                .map(ch -> mapping.get(ch) > 1 ? ")" : "(")
                .collect(Collectors.joining());
    }
}