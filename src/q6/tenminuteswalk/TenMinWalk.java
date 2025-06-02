package q6.tenminuteswalk;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        int x = 0, y = 0;
        for (char ch : walk) {
            switch (ch) {
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                case 'e':
                    x++;
                    break;
                case 'w':
                    x--;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}