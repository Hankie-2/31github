package de.charginov.leetcode;

import java.util.*;

/*
 *Given a 2D integer array nums, return all elements of nums in diagonal order as shown in the below images.
*/
public class DiagonalTraverseII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findDiagonalOrder(List.of(List.of(1,2,3),List.of(4,5,6),List.of(7,8,9)))));
    }
    public static int[] findDiagonalOrder(List<List<Integer>> N) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        int max = 0, size = 0;
        for(int i = N.size()-1; i>=0 ;i--){
            for(int j = 0; j < N.get(i).size() ;j++){
                map.putIfAbsent(i+j,new ArrayList<>());
                map.get(i+j).add(N.get(i).get(j));
                max = Math.max(max,i+j);
                size++;
            }
        }

        int[] arr = new int[size];
        int inc = 0;
        for(int i = 0;i<=max;i++){
            List<Integer> list = map.get(i);
            for(int j = 0;j<list.size();j++){
                arr[inc++] = list.get(j);
            }
        }


        return arr;
    }
}
