package day4;

public class Recursion2 {
    int sumOfN(int num){
        if(num==1)
            return 1;

        return num+sumOfN(num-1);
    }

    int powerof_aNumber(int num,int power){

        if(power==1)
            return num;

        return num*powerof_aNumber(num,power-1);
    }

    int reversNum(int num,int reverse){

        if(num==0)
            return reverse;

         reverse=reverse*10+(num% 10);
        return reversNum(num/10,reverse);
    }

    int fibonnaci(int num){
        if(num==0)
            return 0;
        else if (num==1)
            return 1;

        return   fibonnaci(num-1) + fibonnaci(num-2);
    }

    public static void main(String[] args) {
        Recursion2 recursion2=new Recursion2();

//        System.out.println("Sum of N is "+recursion2.sumOfN(5));

//        System.out.println(" Power of a  number "+recursion2.powerof_aNumber(2,4));
//
//        System.out.println("Reverse number of 123 is "+recursion2.reversNum(123,0));
        System.out.println("Fibonnaci of 5 is "+recursion2.fibonnaci(5));;



    }
}
