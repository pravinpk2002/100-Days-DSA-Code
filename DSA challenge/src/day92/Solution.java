package day92;

public class Solution {
//1423. Maximum Points You Can Obtain from Cards
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;


        for (int point : cardPoints) {
            totalSum += point;
        }


        if (k == n) return totalSum;


        int windowSum = 0;
        for (int i = 0; i < n - k; i++) {
            windowSum += cardPoints[i];
        }

        int minWindowSum = windowSum;


        for (int i = n - k; i < n; i++) {
            windowSum += cardPoints[i] - cardPoints[i - (n - k)];
            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        return totalSum - minWindowSum;
    }
}
