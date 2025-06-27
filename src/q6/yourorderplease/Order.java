package q6.yourorderplease;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Order {
    public static String order(String words) {
        if (words == null || words.isEmpty()) return "";

        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(Order::counting))
                .collect(Collectors.joining(" "));
    }

    public static int counting(String s) {
        String num = s.replaceAll("\\D", "");
        if (num.isEmpty()) {
            throw new IllegalArgumentException("Word does not contain a digit: " + s);
        }
        return Integer.parseInt(num);
    }
}

/*
Your task is to sort a given string.
Each word in the string will contain
a single number. This number is
the position the word should have
in the result.

Note: Numbers can be from 1 to 9.
So 1 will be the first word (not 0).

If the input string is empty,
return an empty string.
The words in the input String will
only contain valid consecutive numbers.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
 */