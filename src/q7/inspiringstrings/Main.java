package q7.inspiringstrings;

import java.util.Arrays;

public class Main {


    public static String longestWord(String wordString) {



        // Give me back the longest word!


    return Arrays.stream(wordString.split(" ")).reduce("", (longest,current) -> longest.length() >= current.length() ? longest : current);
    }

}
