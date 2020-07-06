package com.share.solution.netty;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * future 探索
 *
 * @author Lgq create on 2020-01-17
 */
public class FutureExplore {


    public static CompletableFuture<Integer> completa() {
        final CompletableFuture<Integer> future = new CompletableFuture<>();
        return future;
    }

    public static void main(String[] args) throws Exception {
        final CompletableFuture<Integer> future = completa();
        class Client extends Thread {
            CompletableFuture<Integer> future;

            Client(String threadName, CompletableFuture<Integer> f) {
                super(threadName);
                this.future = future;
            }

            @Override
            public void run() {
                try {
                    System.out.println(this.getName() + ": " + future.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }
        new Client("Client1", future).start();
        new Client("Client2", future).start();
        System.out.println("waiting");
        future.complete(100);
//        future.completeExceptionally(new Exception());
        System.in.read();
    }
}
