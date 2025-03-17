package q7;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/*
TODO

Write a function which reduces fractions to their simplest form!
Fractions will be presented as an array/tuple (depending on the language)
of strictly positive integers, and the reduced fraction must be returned as an array/tuple:

input:   [numerator, denominator]
output:  [reduced numerator, reduced denominator]
example: [45, 120] --> [3, 8]
All numerators and denominators will be positive integers.

Note: This is an introductory Kata for a series... coming soon!

----
Беремо два числа a і b.
Знаходимо залишок від ділення a % b і оновлюємо a = b, b = залишок.
Повторюємо, доки b не стане 0.
Коли b == 0, a – це НСД.
 */

public class Reduce{
    public static int[] myFraction(int[] fractions){

            int num = fractions[0];
            int denom = fractions[1];

            // Знаходимо НСД
            int gcd = findGCD(num, denom);

            // Ділимо чисельник і знаменник на НСД
            return new int[]{num / gcd, denom / gcd};
        }

        // Функція для знаходження НСД за алгоритмом Евкліда
        private static int findGCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }

class SampleTest {
    @ParameterizedTest(name = "Fraction = '{'{2}, {3}'}'")
    @DisplayName("Sample test cases")
    @CsvSource({
            "   3, 1,     60,  20",
            "   2, 3,     80, 120",
            "   2, 1,      4,   2",
            "   3, 8,     45, 120",
            "1000, 1,   1000,   1",
            "   1, 1,      1,   1"
    })
    void exampleTests(int expectedNumerator, int expectedDenominator, int nominator, int denominator){
        assertArrayEquals(new int[]{expectedNumerator, expectedDenominator}, Reduce.myFraction(new int[]{nominator, denominator}));
    }
}