package com.github.lf2a;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Hello world!
 */
public class App {

    private static final ExecutorService threadPool = Executors.newFixedThreadPool(2);

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        var client = new HttpClientDemo();

        Future<Boolean> future = threadPool.submit(client);

        while(!future.isDone()) {
            System.out.print("\rA tarefa esta sendo processada!");
            Thread.sleep(1);
        }

        System.out.println("\nTarefa completa!");
        boolean b = future.get();

        System.out.println("Requisição feita");
        threadPool.shutdown();
    }
}
