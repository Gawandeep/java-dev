package com.completableFutures;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFuturesMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
		    try {
		        TimeUnit.SECONDS.sleep(1);
		    } catch (InterruptedException e) {
		        throw new IllegalStateException(e);
		    }
		    return "Hello";
		});
		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
		    try {
		        TimeUnit.SECONDS.sleep(1);
		    } catch (InterruptedException e) {
		        throw new IllegalStateException(e);
		    }
		    return "World";
		});

		// Block and get the result of the Future
		String result1 = future.get();
		String combined = Stream.of(future, future1)
				  .map(CompletableFuture::join)
				  .collect(Collectors.joining(" "));

		
		String result = future.get();
		System.out.println(combined);


	}

}
