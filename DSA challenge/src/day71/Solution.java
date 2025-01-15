package day71;

public class Solution {

    public int numDecodings(String s) {

        int[] table = new int[s.length()+1];
        table[0] = 1;
        table[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i < table.length; i++) {
            int first = Integer.valueOf(s.substring(i-1,i));
            int second = Integer.valueOf(s.substring(i-2,i));

            if (first >= 1 && first <= 9)
                table[i] = table[i-1];

            if (second >=10 && second <= 26)
                table[i] += table[i-2];
        }

        return table[table.length-1];
    }
}
