package q7.squaredigits;

public class SquareDigit {
    public int squareDigits(int n) {
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .map(a->a*a)
                .mapToObj(String::valueOf)
                .collect(java.util.stream.Collectors.joining()));
    }
}