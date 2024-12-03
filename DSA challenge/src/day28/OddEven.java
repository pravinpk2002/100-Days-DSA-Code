package day28;

public class OddEven {

    public String OddEven(int n){

        if((n & 1) == 0){
            return "even";
        }

        return "odd";

    }
    public static void main(String[] args) {

        OddEven oddEven = new OddEven();
        System.out.println(oddEven.OddEven(99));

    }
}
