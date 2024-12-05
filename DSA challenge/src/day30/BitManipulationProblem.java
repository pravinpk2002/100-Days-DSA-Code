package day30;

public class BitManipulationProblem {
    public static int minBitFlips(int start, int goal) {

        int countFlip = 0;
        int newNum = start ^ goal;

        while(newNum != 0){
            if((newNum & 1) != 0){
                countFlip++;
            }
            newNum = newNum >> 1;
        }
        return countFlip;

    }


    public static void main(String[] args) {

        System.out.println("Total flip count : "+minBitFlips(9,15) );

    }
}
