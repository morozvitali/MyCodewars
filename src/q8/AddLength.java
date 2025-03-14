package q8;

public class AddLength {

/*
TODO

What if we need the length of the words separated
by a space to be added at the end of that same
word and have it returned as an array?

Example(Input --> Output)

"apple ban" --> ["apple 5", "ban 3"]
"you will win" -->["you 3", "will 4", "win 3"]
Your task is to write a function that takes a String
and returns an Array/list with the length of each
word added to each element .

Note: String will have at least one element;
words will always be separated by a space.
*/

    public static String[] addLength(String str){
        String [] strs = str.split(" ");
        for (int i = 0; i < strs.length; i++) {
            strs[i] = strs[i] + " " + strs[i].length();
        }
        return strs;


        //     return stream(str.split(" ")).map(s -> String.format("%s %d", s, s.length())).toArray(String[]::new);
    }
}
