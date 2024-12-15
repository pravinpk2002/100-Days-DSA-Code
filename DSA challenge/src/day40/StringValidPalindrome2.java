package day40;

public class StringValidPalindrome2 {

    public boolean isPalindrome(String s,int i, int j){

        while(i<j){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else
            {
                return false;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i =0;
        int j =s.length() - 1;
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
        }
        return true;
    }

    public static void main(String[] args) {
        StringValidPalindrome2 string  = new StringValidPalindrome2();

        System.out.println(string.validPalindrome("abbca"));


    }
}
