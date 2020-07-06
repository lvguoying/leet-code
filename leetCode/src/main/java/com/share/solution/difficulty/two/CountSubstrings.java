package com.share.solution.difficulty.two;

/**
 * 回文字串
 *
 * @author Lgq create on 2020-03-13
 */
public class CountSubstrings {


    public int countSubstrings(String S) {
        int N = S.length(), ans = 0;
        for (int center = 0; center <= 2 * N - 1; ++center) {
            int left = center / 2;
            int right = left + center % 2;
            while (left >= 0 && right < N && S.charAt(left) == S.charAt(right)) {
                ans++;
                left--;
                right++;
            }
        }
        return ans;
    }


}
