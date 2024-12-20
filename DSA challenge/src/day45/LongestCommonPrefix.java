package day45;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {



         if (strs.length == 0)
            return "";

        String common = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int length = Math.min(common.length(),strs[i].length());

            int j = 0;
            while ( j < length && common.charAt(j) == strs[i].charAt(j) )
                j++;

            common = common.substring(0,j);

            if (common.isEmpty())
                return "";

        }
        return common;

    }

    public static void main(String[] args) {

        String[] strs = {"reflower","flow","flight"};

        LongestCommonPrefix commonPrefix = new LongestCommonPrefix();

        System.out.println(commonPrefix.longestCommonPrefix(strs));

    }
}
