package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        System.out.println(LeetCode.removeDuplicates(nums));
        int [] arr1 = {1,2,3,4,5,6,7};
        LeetCode.rotate1(nums,3);
//        System.out.println(Arrays.toString(arr1));
        int [] arr2 = {1,2,3,4,5,6,7};
        LeetCode.rotate2(arr2,3);
        System.out.println(Arrays.toString(arr2));
    }
}
