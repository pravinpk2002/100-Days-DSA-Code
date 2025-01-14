package day70;

import java.util.*;

public class Solution {

    public List<String> topKFrequent(String[] words, int k) {

        List<String> list = new ArrayList<>();

        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {


            if (map.containsKey(words[i])){
                int count = map.get(words[i]) + 1;
                map.put(words[i],count);
            }else{
                map.put(words[i],1);
            }

        }

        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(
                (a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue()
        );

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            pq.offer(entry);
            if(pq.size()>k)
                pq.poll();
        }

        while(!pq.isEmpty())
            list.add(0,pq.poll().getKey());


        return list;

    }

    public static void main(String[] args) {
        String words[] = {"i","love","leetcode","i","love","coding"} ;
        Solution obj = new Solution();

        System.out.println(obj.topKFrequent(words,2));
    }

}
