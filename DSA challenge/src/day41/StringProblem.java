package day41;

public class StringProblem {

    //389. Find the Difference
    public char findTheDifference(String s, String t) {

        int[] freq = new int[26];

        for (char c : s.toCharArray()){
            freq[c - 'a']++;
        }

        for (char c : t.toCharArray()){
            freq[c - 'a']--;
            if(freq[c - 'a'] < 0){
                return c;
            }
        }
        return 0;

    }


    public static void main(String[] args) {

        StringProblem stringProblem = new StringProblem();

        System.out.println(stringProblem.findTheDifference("abcd","abcde"));

        System.out.println(stringProblem.findTheDifference("abcd","abcde"));

    }

}
