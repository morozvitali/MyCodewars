package q6.stringtocamelcase;

import java.lang.StringBuilder;
import java.util.Arrays;
//import java.util.Arrays;
//import java.util.stream.Collectors;

class Solution{

    static String toCamelCase(String s){
        String word = java.util.Arrays.stream(s.split("-_"))
                .limit(1)
                .collect(java.util.stream.Collectors.joining());

        return word + java.util.Arrays.stream(s.split("[-_]")).skip(1)
                .map(a->a.substring(0,1).toUpperCase() + a.substring(1))
                .collect(java.util.stream.Collectors.joining());
    }
}