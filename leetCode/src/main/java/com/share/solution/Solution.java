package com.share.solution;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Lgq create on 2019/11/19
 **/
public class Solution {



    private boolean isValid(String[] str) {

        if (str.length <= 1) {
            return false;
        }

        String left = "([,{";
        Stack<String> stack = new Stack<String>();

        for (int i = 0; i < str.length - 1; i++) {
            if (str[i].contains(left)) {
                stack.push(str[i]);
            } else if (!stack.isEmpty() || stack.pop().equals(str[i])) {
                return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("444");
        BigDecimal b = new BigDecimal("333");

        System.out.println(a.compareTo(b));

        System.out.println(1/0);
    }
}
