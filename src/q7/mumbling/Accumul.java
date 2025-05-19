package q7.mumbling;

public class Accumul {
    public static String accum(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        char[] charactersB = s.toUpperCase().toCharArray();
        char[] charactersS = s.toLowerCase().toCharArray();

        for (int i = 0; i<s.length(); i++) {
            stringBuilder.append(charactersB[i]);

            for (int a=0; a<i; a++) {
            stringBuilder.append(charactersS[i]);
            }
            if (i != (s.length()-1)) {
                stringBuilder.append("-");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(Accumul.accum("uiayscdkj"));
        System.out.println(Accumul.accum("qwer"));
    }
}


/*
This time no story, no theory. The examples below show you how to write function accum:

Examples:
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.
 */