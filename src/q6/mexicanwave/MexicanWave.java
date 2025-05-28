package q6.mexicanwave;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {
    public static String[] wave(String str) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == ' ') {
                //result.add("");
            } else {
                StringBuilder wave = new StringBuilder(str);
                wave.setCharAt(i, Character.toUpperCase(currentChar));
                result.add(wave.toString());
            }
        }

        return result.toArray(new String[0]);
    }



    public static void main(String[] args) {
        for (String s : MexicanWave.wave("Two words")) {
            System.out.println(s);
        }
    }
}