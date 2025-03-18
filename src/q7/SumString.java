package q7;

public class SumString {

    /*
    Create a function that takes 2 integers in form of
    a string as an input, and outputs the sum (also as a string):

Example: (Input1, Input2 -->Output)

"4",  "5" --> "9"
"34", "5" --> "39"
"", "" --> "0"
"2", "" --> "2"
"-5", "3" --> "-2"
Notes:

If either input is an empty string, consider it as zero.

Inputs and the expected output will never exceed
the signed 32-bit integer limit (2^31 - 1)


     */

        public static String sumStr(String a, String b){
            if (a.isEmpty()) {a = "0";}
            if (b.isEmpty()) {b = "0";}
            Integer sum = Integer.valueOf(a) + Integer.valueOf(b);
            return sum.toString();

            // return (a.isEmpty() ? 0 : Integer.parseInt(a)) + (b.isEmpty() ? 0 : Integer.parseInt(b)) + "";
        }
    }