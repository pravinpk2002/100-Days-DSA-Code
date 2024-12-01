package day26;

public class BitManipulation {

    public void getBit(int num, int position){

        int bitMask = 1 << position - 1;

        if((bitMask & num) == 0){
            System.out.println("bit at postion "+ position +" is zero ");
        }else{
            System.out.println("bit at postion "+ position +" is one ");
        }

    }

    public void  setBit(int num, int position){
        int bitMask = 1 << position - 1;

        System.out.println("New number after setBit opertion at position "+position +" is "+ (num | bitMask));

    }
    
    public void clearBit(int num, int position){
        int bitMask = 1 << position - 1;

        bitMask = ~(bitMask);
        num = num & bitMask;

        System.out.println("new number after clear bit at position at "+position+" is "+ num);

    }


    public static void main(String[] args) {

        BitManipulation bitManipulation = new BitManipulation();

        bitManipulation.getBit(5,2);

        bitManipulation.setBit(5,2);

        bitManipulation.clearBit(5,1);

    }

}
