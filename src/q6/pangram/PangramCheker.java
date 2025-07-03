package q6.pangram;

public class PangramCheker {
    public boolean check(String sentence){
        return sentence.toLowerCase().chars().filter(Character::isLetter).distinct().count() == 26;
    }
}
