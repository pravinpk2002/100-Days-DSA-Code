package day69;

import java.util.Stack;

public class Solution {

    public String removeKdigits(String num, int k) {

        int length = num.length();
        Stack<Character> stack = new Stack<>();

        for (char c : num.toCharArray()){

            while(!stack.isEmpty() && k > 0 && stack.peek() > c){
                stack.pop();
                k--;
            }


            if (!stack.isEmpty() || c!='0')
                stack.push(c);
        }


        while (!stack.isEmpty() && k-- > 0 )
            stack.pop();

        if (stack.isEmpty())
            return "0";

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        result.reverse();
        return result.toString();
    }

    public static void main(String[] args) {
        String num = "1432219";

        System.out.println(num);
        Solution obj = new Solution();
        String str =  obj.removeKdigits(num,3);
        System.out.println(str);
    }
}
