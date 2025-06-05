package q6.stopspinning;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(a->a.length() >=5
                        ? new StringBuilder(a).reverse().toString()
                        : a)
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        SpinWords spinWords = new SpinWords();
        System.out.println(spinWords.spinWords("Hey fellow warriors This is a test"));
    }
}

