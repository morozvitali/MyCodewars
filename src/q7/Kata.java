package q7;
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