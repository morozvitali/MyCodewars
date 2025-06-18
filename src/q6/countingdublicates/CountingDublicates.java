package q6.countingdublicates;

import java.util.Map;
import java.util.stream.Collectors;

public class CountingDublicates {
    public static int duplicateCount(String text) {

    Map <Character, Long> map = text.toLowerCase().chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors
                    .groupingBy(a->a, Collectors
                            .counting()));
    return (int) map.values().stream().filter(count -> count > 1).count();
    }
}

/*
Write a function that will return the count
of distinct case-insensitive alphabetic characters
and numeric digits that occur more than once in
the input string. The input string can be assumed
to contain only alphabets (both uppercase and lowercase)
 and numeric digits.

 Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
 */