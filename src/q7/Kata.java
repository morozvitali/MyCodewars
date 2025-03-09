package q7;

import java.util.Arrays;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Kata {
/*
TODO:
Given a sequence of integers, return the sum of all
the integers that have an even index (odd index in COBOL),
multiplied by the integer at the last index.
Indices in sequence start from 0.
If the sequence is empty, you should return 0.
 */

    public static int evenLast(int[] numbers){
        int sum = 0;

        for (int i = 0; i<numbers.length; i++) {
            if (i % 2 == 0) {
                sum += numbers[i];
            }
        }

        if (numbers.length == 0) {return 0;}
        return sum * numbers[numbers.length-1];
    }

}



class EvenLastTest {

    private static void doTest(int[] arr, int expected) {
        assertEquals(expected, Kata.evenLast(arr),
                "evenLast(" + Arrays.toString(arr) + ") returned an incorrect result.\n\n"
        );
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest(new int[]{2, 3, 4, 5}, 30);
        doTest(new int[]{}, 0);
        doTest(new int[]{2, 2, 2, 2}, 8);
        doTest(new int[]{1, 3, 3, 1, 10}, 140);
        doTest(new int[]{-11, 3, 3, 1, 10}, 20);
    }
}
