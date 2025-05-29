package q7.substringout;

public class Solution {
    public static int substringCount(String fullText, String search) {
        // Do your thing.
        int counter = 0;
        int index = 0;

        while (true) {
            index = fullText.indexOf(search, index);
            if (index < 0) {
                break;
            }
            index += search.length();
            counter++;
        }
        return counter;
    }

    //or     return (fullText + "_").split(search).length - 1;

    public static void main(String[] args) {
        System.out.println(Solution.substringCount("aaabbbccc", "bb"));
    }
}