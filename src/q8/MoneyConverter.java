package q8;

public class MoneyConverter {
    /*

    Create a function that converts US dollars (USD) to Chinese Yuan (CNY) .
    The input is the amount of USD as an integer, and the output should be
    a string that states the amount of Yuan followed by 'Chinese Yuan'

Examples (Input -> Output)
15  -> '101.25 Chinese Yuan'
465 -> '3138.75 Chinese Yuan'
The conversion rate you should use is 6.75 CNY for every 1 USD. All numbers
should be represented as a string with 2 decimal places. (e.g. "21.00" NOT "21.0" or "21")

     */
        public static class Kata {
            public static String usdcny(int usd) {
                String kata = String.format("%.2f Chinese Yuan", (usd * 6.75));
                return kata;
            }
        }

        public static void main(String[] args) {
            Kata kata = new Kata();
            kata.usdcny(10);
        }
    }
