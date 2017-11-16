package com.github.ljtfreitas.rx.sample;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class RxSample20 {

	public static void main(String[] args) throws Exception {
		Observable.interval(1, TimeUnit.SECONDS)
			.map(n -> "value " + n)
				.throttleFirst(3, TimeUnit.SECONDS)
					.subscribe(System.out::println);

		Observable.interval(1, TimeUnit.SECONDS)
			.map(n -> "value " + n)
				.throttleLast(3, TimeUnit.SECONDS)
					.subscribe(System.out::println);

		Observable.interval(3, TimeUnit.SECONDS)
			.debounce(2, TimeUnit.SECONDS)
				.subscribe(System.out::println);

		Observable.interval(3, TimeUnit.SECONDS)
			.timeout(2, TimeUnit.SECONDS)
				.subscribe(System.out::println);
		
		Observable.interval(1, TimeUnit.SECONDS)
			.sample(2, TimeUnit.SECONDS)
				.subscribe(System.out::println);
		
		Thread.sleep(10000);
	}
}
