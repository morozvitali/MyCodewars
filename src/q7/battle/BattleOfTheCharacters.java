package q7.battle;

public class BattleOfTheCharacters {

    public static String battle(final String x, final String y) {
        double sumX = calculatePower(x);
        double sumY = calculatePower(y);
        if (sumX == sumY) {
            return "Tie!";
        }

        return sumX > sumY ? x : y;
    }

    private static double calculatePower(String input) {
        double sum = 0.0;
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sum += ch - 'A' + 1;
            } else if (Character.isLowerCase(ch)) {
                sum += (ch - 'a' + 1) * 0.5;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        BattleOfTheCharacters battle1 = new BattleOfTheCharacters();
        battle1.battle("AAA","Z");
        battle1.battle("ONE",  "TWO");
        battle1.battle("ONE",  "NEO");
        battle1.battle("FOUR", "FIVE");

    }
}
