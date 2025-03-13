package q7.sixеoast;
import org.junit.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
TODO

Story:
You are going to make toast fast, you think that you should make
multiple pieces of toasts and once. So, you try to make 6 pieces of toast.

Problem:
You forgot to count the number of toast you put into there,
you don't know if you put exactly six pieces of toast into the toasters.

Define a function that counts how many more (or less) pieces of toast
you need in the toasters. Even though you need more or less, the number
will still be positive, not negative.

Examples:
You must return the number of toast the you need to put in (or to take out).
In case of 5 you can still put 1 toast in:

5 --> 1
And in case of 12 you need 6 toasts less (but not -6):

12 --> 6
Good luck!

 */
public class Kata {
    public static int sixToast(int num) {
        return num > 6 ? num -6 : 6 - num;

        // better variant Math.abs(6 - num);
    }
}



class SixToastTest {

    public static void main(String[] args) {
        SixToastTest sixToastTest = new SixToastTest();
        sixToastTest.sampleTests();
    }
    private static void doTest(int num, int expected) {
        assertEquals(expected, Kata.sixToast(num), "Incorrect answer for num = " + num + "\n\n");
    }

    @Test
    @DisplayName("Sample Tests")
    public void sampleTests() {
        doTest(15, 9);
        doTest(6, 0);
        doTest(3, 3);
    }
}