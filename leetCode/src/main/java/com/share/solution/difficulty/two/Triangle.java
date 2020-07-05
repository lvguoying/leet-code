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



    }

    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> mini = new ArrayList<>();
        for (int i = 0; i < triangle.size() - 1; i++) {
            mini.add(0);
        }

        for (int i = triangle.size() - 2; i >= 0; --i) {
            for (int j = 0; j < triangle.get(i).size(); ++j) {
                int miniV = triangle.get(i).get(j) + Math.min(mini.get(j), mini.get(j + 1));
                System.out.println(miniV);
                mini.add(j, miniV);
            }
        }
        return mini.get(0);
    }
}
