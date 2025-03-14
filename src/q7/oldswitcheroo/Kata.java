package q7.oldswitcheroo;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static String vowel2Index(String s) {
        //code me
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('a', 1);
        map.put('e', 1);
        map.put('i', 1);
        map.put('o', 1);
        map.put('u', 1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                sb.append(i+1);
            } else {
                sb.append(s.charAt(i));
            }
        }
return sb.toString();
    }

    // result.append("aeiou".indexOf(s.charAt(i)) < 0 ? s.charAt(i) : i + 1 + "");

    /*
    TODO:
    Write a function
vowel2Index(String s)
that takes in a string and replaces all the vowels
[a,e,i,o,u] with their respective positions within that string.
E.g:
Kata.Vowel2Index("this is my string") == "th3s 6s my str15ng"
Kata.Vowel2Index("Codewars is the best site in the world") == "C2d4w6rs
10s th15 b18st s23t25 27n th32 w35rld"
Your function should be case insensitive to the vowels.
     */
}
