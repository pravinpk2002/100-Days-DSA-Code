package day27;

public class CountTotalSetBit {


    public static int countSetBits(int n) {
        int count = 0;
        for (int i = 0; (1 << i) <= n; i++) {
            int totalPairs = (n + 1) / (1 << (i + 1));
            count += totalPairs * (1 << i);

            int remaining = (n + 1) % (1 << (i + 1));
            if (remaining > (1 << i)) {
                count += remaining - (1 << i);
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int n = 17;
        System.out.println("total set bits from 1 to "+n+" is : "+countSetBits(n));

    }
}
