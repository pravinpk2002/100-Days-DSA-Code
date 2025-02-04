package day91;

public class Solution {


//    1358. Number of Substrings Containing All Three Characters
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] count = new int[3];
        int left = 0;
        int result = 0;

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            count[currentChar - 'a']++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                result += n - right;
                char leftChar = s.charAt(left);
                count[leftChar - 'a']--;
                left++;
            }
        }

        return result;
    }

}
