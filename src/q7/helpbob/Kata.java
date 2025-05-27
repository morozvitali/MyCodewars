package q7.helpbob;
/*
TODO:
Bob is a lazy man.
He needs you to create a method that can determine
how many letters (both uppercase and lowercase ASCII
letters) and digits are in a given string.
Example:
"hel2!lo" --> 6
"wicked .. !" --> 6
"!?..A" --> 1
 */

//Character.isLetterOrDigit(c)
//input.replaceAll("[^a-zA-Z\\d]", "").length()

public class Kata{
    public static int countLettersAndDigits(String input){
                int count = 0;
        for (char c : input.toLowerCase().toCharArray())  {
            if ((c>=48&&c<=57) || (c>=97&&c<=122))
            {count++;}
        }
        return count;
    }
}