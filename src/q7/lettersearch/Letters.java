package q7.lettersearch;

public class Letters {
    public static void main(String[] args) {
        System.out.println(Letters.search("az"));
    }


    public static String search(String line) {
        //Your code here :)
        StringBuilder sb = new StringBuilder("00000000000000000000000000");

        line = line.toLowerCase();
        for (int i = 0; i<line.length(); i++) {

            if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z') {
                sb.setCharAt(line.charAt(i) - 'a', '1');
            }
        }
        return sb.toString();
    }
}


/*
Create a function which accepts one arbitrary
string as an argument, and return a string of length 26.
The objective is to set each of the 26 characters of
the output string to either '1' or '0' based on the fact
whether the Nth letter of the alphabet is present in the
input (independent of its case).
So if an 'a' or an 'A' appears anywhere in the input
string (any number of times), set the first character
of the output string to '1', otherwise to '0'. if 'b' or 'B'
appears in the string, set the second character to '1',
and so on for the rest of the alphabet.

For instance:

"a   **&  cZ"  =>  "10100000000000000000000001"
"aaaaaaa79345675"  =>  "10000000000000000000000000"
"&%#*"  =>  "00000000000000000000000000"
 */