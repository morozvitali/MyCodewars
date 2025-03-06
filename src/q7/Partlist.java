package q7;

import java.util.Arrays;

public class Partlist {
    public static void main(String[] args) {
        Partlist p = new Partlist();
        System.out.println(p.partlist());
    }

    public static String[][] partlist() {
        String[] arr = {"az", "toto", "picaro", "zone", "kiwi"};
        // your code

        String [][] arr2 = new String[arr.length-1][2];

        for (int i = 1; i < arr.length; i++) {
            arr2[i - 1][0] = String.join(" ", Arrays.copyOfRange(arr, 0, i));
            arr2[i - 1][1] = String.join(" ", Arrays.copyOfRange(arr, i, arr.length));
        }

        return arr2;



    }
}