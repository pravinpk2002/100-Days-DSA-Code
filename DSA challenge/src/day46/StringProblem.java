package day46;

public class StringProblem {


    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        int len1 = haystack.length();
        int len2 = needle.length();

        int i = 0;
        while(i < len1){
            int j = 0;
            int index = i;
            while(i < len1 && j < len2   && haystack.charAt(i) == needle.charAt(j)){

                i++;
                j++;

            }

            if (j == len2 )
                return index;

            i = index + 1;
        }

        return -1;

    }

    public static void main(String[] args) {

        StringProblem problem = new StringProblem();

        System.out.println(problem.strStr("mississippi","issip"));

        System.out.println(problem.strStr("sadbusted","sad"));

    }
}
