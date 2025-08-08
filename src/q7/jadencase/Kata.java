package q7.jadencase;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public String toJadenCase(String phrase) {

        return  phrase == null ? null :
                phrase.isEmpty() ? null :
                        Arrays.stream(phrase.split(" "))
                                .map(w->Character.toUpperCase(w.charAt(0)) + w.substring(1))
                                .collect(Collectors.joining(" "));
    }
}