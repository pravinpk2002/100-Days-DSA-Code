package day48;

public class Solution {

    //Number of Strings That Appear as Substrings in Word

    public static int numOfStrings(String[] patterns, String word) {

        int count = 0;
        for (int i = 0; i < patterns.length; i++) {

            if( word.contains( patterns[i]) == false){
                return count;
            }

            count++;

        }

        return count;

    }


    public static void main(String[] args) {

        String patterns[]  = {"a", "abc", "bc", "d"};
        String words = "abc";

        String patterns2[] = {"a","a","a"};
        String patterns3[] = {"a","b","c"};

        System.out.println(numOfStrings(patterns3,"aaaaabbbbb"));

    }
}
