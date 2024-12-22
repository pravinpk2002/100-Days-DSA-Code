package day47;

public class Check_If_String_Is_a_Prefix_o_fArray {
    public static boolean isPrefixString(String s, String[] words) {
        int j = 0,k = 0;
        for (int i = 0; i < s.length(); i++,k++) {


            if(k == words[j].length()){
                j++;
                k=0;
            }

            if ( j==words.length || words[j].charAt(k)!=s.charAt(i)){
                return false;
            }

        }

        if (k != words[j].length())
            return false;

        return true;
    }

    public static void main(String[] args) {
        String s = "iloveleetcode";
        String words[] = {"i","love","leetcode","apples"};
        String words2[] = {"apples","i","love","leetcode"};
        String words3[] = {"aa","aaaa","banana"};

        System.out.println(isPrefixString(s,words));

        System.out.println(isPrefixString(s,words2));

        System.out.println(isPrefixString("a",words3));

    }
}
