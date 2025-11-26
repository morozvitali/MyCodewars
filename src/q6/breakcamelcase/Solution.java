package q6.breakcamelcase;

import java.util.stream.Collectors;

class Solution {
    public static String camelCase(String input) {
        return  input.chars().mapToObj(c->String.valueOf((char)c)).map(w->Character.isUpperCase(w.charAt(0)) ? " " + w : w).collect(Collectors.joining());
        //return input.replaceAll("([A-Z])", " $1");

    }

    public static void main(String[] args) {
        System.out.println(camelCase("aSEFAZSFDASDCACPIUGBk;jbnjkhpo[iuhO{IH[opiho[ipkh"));
    }
}