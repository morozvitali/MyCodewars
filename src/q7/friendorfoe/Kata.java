package q7.friendorfoe;

import java.util.List;
class Kata {
    public static List<String> friend(List<String> x){
        // Your code here
        return x.stream().filter(a->a.length() == 4).toList();
    }
}


/*

Make a program that filters a list of strings and returns
a list with only your friends name in it.

If a name has exactly 4 letters in it, you can be sure
that it has to be a friend of yours! Otherwise,
you can be sure he's not...

Input = ["Ryan", "Kieran", "Jason", "Yous"]
Output = ["Ryan", "Yous"]

Input = ["Peter", "Stephen", "Joe"]
Output = []
Input strings will only contain letters.
Note: keep the original order of the names in the output.


 */