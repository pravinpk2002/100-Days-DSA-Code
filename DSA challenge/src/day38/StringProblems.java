package day38;

public class StringProblems {

    String removeWhitSpace(String string){

            return string.replaceAll(" ","");
    }

    boolean palindromString(String string){

        String reverse = "";
        for (int i = string.length() - 1; i >= 0 ; i--) {
            reverse += string.charAt(i);
        }

        return string.equals(reverse);
    }



    public static void main(String[] args) {
        String string = "hello public";
        System.out.println(string);

        StringProblems stringProblems = new StringProblems();

        string = stringProblems.removeWhitSpace(string);
        System.out.println(string);

        System.out.println("is given string palindrome "+ stringProblems.palindromString("madam"));
    }
}
