package q7.nicknamegenerator;

class Generator {
    public static String nickname(String name) {
        if (name.length() < 4) {
            return "Error: Name too short";
        }

        return "aeiou".indexOf(name.charAt(2)) >= 0 ? name.substring(0, 4) : name.substring(0, 3);
    }
}