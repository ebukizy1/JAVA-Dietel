package Dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int target = 6;
        System.out.println(Arrays.toString(arr(nums, target)));
//        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//                You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.


//
////        Input: nums = [2,7,11,15], target = 9
////        Output: [0,1]
////        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//        int [] myArrays = {2, 7, 11, 15};
//        int [] myArray = new int [myArrays.length];
//        for (int i = 0; i < myArrays.length; i++){
//
    }
public static int[] arr(int[] nums, int target){
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i <nums.length ; i++) {
        int sum = 0;
        result.clear();
        for (int j = i; j <nums.length ; j++) {
            sum+=nums[j];
            result.add(j);
            if (sum == target){
                int[] value = new int[result.size()];
                for (int k = 0; k < result.size(); k++) {
                    value[k] = result.get(k);
                }
         return value;
        }
    }
        }
    return new int[]{0};
}
}
