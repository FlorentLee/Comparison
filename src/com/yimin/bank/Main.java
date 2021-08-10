package com.yimin.bank;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 3, 15, 11, 2};
        int[] b = {23, 127, 235};
        System.out.println(findSmallestDifference(a,b));
    }

    public static int findSmallestDifference(int[] a, int[] b){
        int res = Integer.MAX_VALUE;
        int[] longer;
        int[] shorter;
        if(a.length <= b.length){
            longer = b;
            shorter = a;
        }else{
            longer = a;
            shorter = b;
        };
        for(int j = 0; j < shorter.length; j++){
            for(int i = 0; i <= longer.length - shorter.length; i++){
                int diff = Math.abs(longer[j+i] - shorter[j]);
                res = Math.min(diff, res);
            }
        }
        return res;
    }
}