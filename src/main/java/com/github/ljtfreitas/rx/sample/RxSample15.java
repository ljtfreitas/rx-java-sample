package com.github.ljtfreitas.rx.sample;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class RxSample15 {

	public static void main(String[] args) throws Exception {
		Observable.interval(500, TimeUnit.MILLISECONDS)
			.map(v -> "value " + v)
				.buffer(2)
					.subscribe(System.out::println);

		Observable.interval(500, TimeUnit.MILLISECONDS)
			.map(v -> "value " + v)
				.buffer(2, TimeUnit.SECONDS)
					.subscribe(System.out::println);

		Observable<Long> boundary = Observable.interval(2, TimeUnit.SECONDS); 
		
		Observable.interval(500, TimeUnit.MILLISECONDS)
			.map(v -> "value " + v)
				.buffer(boundary)
					.subscribe(System.out::println);

		Thread.sleep(10000);
	}
}
