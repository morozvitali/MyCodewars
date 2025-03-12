package q7;

    public class XO {
        public static boolean getXO (String str) {
            // Good Luck!!
            return str.toLowerCase().replaceAll("[^x]", "").length() == str.toLowerCase().replaceAll("[^o]", "").length();
        }
    }

    /*
    TODO
    Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
     */