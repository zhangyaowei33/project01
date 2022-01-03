package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> output = new ArrayList<Integer>();
        for(int num : nums){
            output.add(num);
        }
        int n = nums.length;
        backtrack(n, output, res, 0);
        return res;
    }

    public static void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first){
        if(n==first){
            res.add(new ArrayList<Integer>(output));
        }
        for(int i=first; i<n; i++){
            Collections.swap(output,first,i);
            backtrack(n, output, res, first+1);
            Collections.swap(output,first,i);
        }
    }

    public static void main(String[] args) {
        int[] RR = new int[]{1,2,3};
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        permute(RR);
        System.out.println(permute(RR));
    }
}
