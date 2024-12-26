package day51;

public class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = 0;

        for (int pile : piles){
            maxSpeed = Math.max(pile,maxSpeed);
        }

        while(minSpeed < maxSpeed){
            int mid = minSpeed + (maxSpeed - minSpeed)/2;

            if( canItInTime(piles,h,mid)){
                maxSpeed = mid;
            }else{
                minSpeed = mid + 1;
            }
        }
        return minSpeed;
    }

    private boolean canItInTime(int[] piles, int h, int mid) {
        int hours = 0;
        for (int pile : piles){
            hours += (int) Math.ceil((double)pile / mid);
        }

        return hours<= h;
    }


}
