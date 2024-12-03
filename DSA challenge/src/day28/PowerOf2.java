package day28;

public class PowerOf2 {

    public boolean isPowerOfTwo(int n) {

        if(n > 0 &&(n & (n - 1)) == 0)
            return true;

        return false;

    }

    public static void main(String[] args) {
        PowerOf2 powerOf2 = new PowerOf2();

        if(powerOf2.isPowerOfTwo(64) == true)
            System.out.println("Number is power of 2");
        else
            System.out.println("Number is not power of 2 ");
    }

}
