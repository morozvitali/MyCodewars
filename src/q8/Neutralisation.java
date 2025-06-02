package q8;

import java.util.HashMap;
import java.util.Map;

public class Neutralisation {
    public static String neutralise(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<s1.length(); i++) {
            if ((s1.charAt(i) == '+') && (s2.charAt(i) == '+')) {
                sb.append('+');
            } else if ((s1.charAt(i) == '-') && (s2.charAt(i) == '-')) {
                    sb.append('-');
                }
            else sb.append('0');
            }
        return sb.toString();
        }
    }

//  return range(0, s1.length()).mapToObj(i -> s1.charAt(i) == s2.charAt(i) ? s1.charAt(i) + "" : "0").collect(joining());


// oiyugilgyu

/*
// asdfgvdasfvb
🧩 Умова задачі (українською):
Дано два рядки, які складаються лише зі знаків + та -. Потрібно повернути новий рядок, який показує, як ці два рядки взаємодіють один з одним за такими правилами:

Коли + і + — результат: +
Коли - і - — результат: -
Коли + і - або - і + — результат: 0 (нейтрально)

 */