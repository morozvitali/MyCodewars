package q6.mexicanwave;

import java.util.Arrays;

public class MexicanWave {
    public static String[] wave(String str) {
        // Your code here
        String array[] = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = "";
            for (int a = 0; a < str.length(); a++) {

                if (a != i) {

                    if (str.charAt(a) == ' ') {
                        continue;
                    }

                    array[i] = array[i].concat(str.substring(a, a + 1));
                } else {
                    array[i] = array[i].concat(str.substring(a, a + 1).toUpperCase());
                }


            }
        }
        return array;
    }

    public static void main(String[] args) {
        for (String s : MexicanWave.wave("start drgfsz")) {
            System.out.println(s);
        }
    }
}