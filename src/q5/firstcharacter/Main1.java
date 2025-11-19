package q5.firstcharacter;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main1 {

    public static String firstNonRepeatingLetter(String s){
        Map<String, Long> freq = s.toLowerCase()
                .chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (int i = 0; i < s.length(); i++) {
            String originalChar = String.valueOf(s.charAt(i));
            String lowerChar = originalChar.toLowerCase();

            if (freq.get(lowerChar) == 1) {
                return originalChar;
            }
        }
        return "";
    }
}