package com.share.solution.difficulty.one;

import java.util.PriorityQueue;

/**
 * @author Lgq create on 2020-04-03
 */
public class KthLargest {

    final PriorityQueue<Integer> queue;

    final int k;

    public KthLargest(int k, int[] a) {
        this.k = k;
        queue = new PriorityQueue<Integer>(k);
        for (int n : a) {
            add(n);
        }
    }
    private int add(int n) {

        if (queue.size() < k) {
            queue.offer(n);
        } else if (queue.peek() < n) {
            queue.poll();
            queue.offer(n);

        }
        return queue.peek();
    }
}
