package day35;

import java.util.Stack;

public class ValidParetheses {

    private Stack<Character> stack = new Stack<>();

//    for (int i = 0; i < s.length(); i++) {
//
//        if(s.charAt(i) == '(' ){
//            stack.push(s.charAt(i));
//        }
//        else if(stack.peek() == '(' && s.charAt(i) == ')')
//            stack.pop();
//        else
//            return false;
//    }
    public boolean isValid(String s) {
        String strOpen = "({[";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(strOpen.contains(Character.toString(ch))){
                stack.push(ch);
            }
            else if (ch == ')' && stack.peek() == '(')
                stack.pop();
            else if (ch == '}' && stack.peek() == '{')
                stack.pop();
            else if (ch == ']' && stack.peek() == '[')
                stack.pop();
            else
                return false;

        }

        return stack.isEmpty();

    }
    public static void main(String[] args) {

        String str = "()[]{}";
        ValidParetheses validParetheses = new ValidParetheses();
        System.out.println(validParetheses.isValid(str));

    }
}
