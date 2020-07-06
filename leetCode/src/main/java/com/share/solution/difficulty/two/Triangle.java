package com.share.solution.difficulty.two;

import java.util.ArrayList;
import java.util.List;

/**
 * 三角形最小路径和
 *
 * @author Lgq create on 2020/7/5
 */
public class Triangle {

    public static void main(String[] args) {

        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(2);
        triangle.add(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        triangle.add(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(5);
        list2.add(7);
        triangle.add(list2);

        List<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(1);
        list3.add(3);
        list3.add(8);
        triangle.add(list3);

        minimumTotal(triangle);
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        // 特判
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        // dp中记录了求第i行时，第i+1的最小路径和
        int[] dp = new int[triangle.size() + 1];

        for (int i = triangle.size() - 1; i >= 0; i--) {
            List<Integer> rows = triangle.get(i);
            for (int j = 0; j < rows.size(); j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + rows.get(j);
            }
        }
       for (int i : dp){
           System.out.print(i+"---");
       }
        return dp[0];
    }
}
