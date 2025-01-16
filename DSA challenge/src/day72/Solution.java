package day72;

public class Solution {

    public String countAndSay(int n) {

        String s = "1";

        for (int i = 2; i <= n; i++) {

            s = CountAndSay(s);
        }

        return s;
    }

    private String CountAndSay(String s) {

        StringBuilder newString = new StringBuilder();

        char c = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c)
            {
                count++;
            }else{
                newString.append(count);
                newString.append(c);
                c = s.charAt(i);
                count=1;
            }
        }

        newString.append(count);
        newString.append(c);

        return newString.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.countAndSay(4));
    }
}
