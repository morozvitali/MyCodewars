package q6.splitstrings;

import java.util.Arrays;

public class StringSplit {

    /*
    Complete the solution so that it splits the string into pairs of two characters.
    If the string contains an odd number of characters then it should replace
    the missing second character of the final pair with an underscore ('_').

    Examples:
    * 'abc' =>  ['ab', 'c_']
    * 'abcdef' => ['ab', 'cd', 'ef']
         */

    public static String[] solution(String s) {
        //Write your code here

        if (s.equals("")) {return new String[]{};}
        StringBuilder sb = new StringBuilder();

        for (int i =0; i<s.length(); i++) {
            if (i % 2 != 0) {
                sb.append(s.charAt(i) + "@");
            } else {
                sb.append(s.charAt(i));
            }
            if ((s.length() % 2 != 0) && (i == s.length()-1)){
                sb.append("_");
            }
        }

        return sb.toString().split("@");
    }


    public static void main(String[] args) {
        System.out.println(StringSplit.solution("abcdefd"));

    }
}
