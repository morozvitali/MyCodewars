package q5.scramblies;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
Map<Character, Long> map1 = str1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
Map<Character, Long> map2 = str2.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
return map2.entrySet().stream().allMatch(e ->map1.getOrDefault(e.getKey(), 0L) >= e.getValue());
    }
}

/*
scramble('rkqodlw', 'world') ==> True
scramble('cedewaraaossoqqyt', 'codewars') ==> True
scramble('katas', 'steak') ==> False
 */