package q6.createphonenumber;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        String word = Arrays.stream(numbers).mapToObj(a->String.valueOf(a)).collect(Collectors.joining());
        return "(" + word.substring(0,3) + ") " + word.substring(3,6) + "-" + word.substring(6,10);

        /*
          static String createPhoneNumber(int[] numbers) {
            var phone = "(xxx) xxx-xxxx";
    for (int n : numbers) {
      phone = phone.replaceFirst("x", n + "");
    }
    return phone;
         */
    }
}