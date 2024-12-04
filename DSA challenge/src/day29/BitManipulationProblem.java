package day29;

import java.util.ArrayList;
import java.util.List;

public class BitManipulationProblem {


    static boolean checkKthBit(int n, int k) {
        // Your code here

        int bitMask = 1 << k;

        if((bitMask & n) == 0)
            return false;

        return true;
    }
    static List<Integer> get(int a, int b)
    {
        List<Integer> list = new ArrayList<Integer>();

        a = a ^ b;
        b= a ^ b;
        a = a ^ b;
        list.add(0,a);
        list.add(1,b);
        return list;
    }
    public static void main(String[] args) {


        System.out.println(get(10,20));

        System.out.println(checkKthBit(4,2));

    }
}
