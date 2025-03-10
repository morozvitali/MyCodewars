package q7.helpbob;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

class CountLettersAndDigitsTest {

    private static void doTest(String s, int expected) {
        assertEquals(expected, Kata.countLettersAndDigits(s),
                "countLettersAndDigits(\"" + s + "\") returned an incorrect answer.\n\n"
        );
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest("hel2!lo", 6);
        doTest("n!!_ice!!123", 7);
        doTest("1", 1);
        doTest("?", 0);
        doTest("", 0);
        doTest("12345f%%%t5t&/6", 10);
        doTest("aBcDeFg090", 10);
        doTest("u_n_d_e_r__S_C_O_R_E", 10);
    }
}