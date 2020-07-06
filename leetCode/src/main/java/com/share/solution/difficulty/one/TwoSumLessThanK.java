package com.share.solution.difficulty.one;

/**
 * 题目来源于 LeetCode 上第 1099 号问题：小于 K 的两数之和。
 * 给你一个整数数组 A 和一个整数 K，请在该数组中找出两个元素，使它们的和小于 K 但尽可能地接近 K，返回这两个元素的和。
 * 如不存在这样的两个元素，请返回 -1。
 *
 * @author Lgq create on 2019-12-23
 */
public class TwoSumLessThanK {

    public int twoSumLessThanK(int[] A, int K) {

        if (A == null || A.length == 0) {
            return -1;
        }

        int left = 0;
        int right = A.length - 1;
        int result = Integer.MAX_VALUE;

        while (left < right) {
            result = A[left] + A[right];
            if (A[left] + A[right] > K) {
                right--;
            } else {
                result = Math.max(result, A[left] + A[left]);
                left--;
            }
        }

        return result == Integer.MAX_VALUE ? -1 :result;

    }


}
