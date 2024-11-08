package day3;

public class Recursion {

    long fact(long num){
        if(num==1)
            return 1;
        return num* fact(num-1);
    }

    void print1ToN(int num){
        if(num==0)
            return;

        print1ToN(num-1);
        System.out.print(num+" ");
    }

    void printNto1(int num){
        if(num==0)
            return;

        System.out.print(num+" ");
        printNto1(num-1);

    }

    public static void main(String[] args) {
        Recursion recursion=new Recursion();
//        int num=5;
//        System.out.println("Factorial of "+num+" is "+recursion.fact(5));

//        recursion.print1ToN(10);

        recursion.printNto1(10);


    }

}
