package com.github.ljtfreitas.rx.sample;

import io.reactivex.Observable;

public class RxSample19 {

	public static void main(String[] args) throws Exception {
		Observable.range(0, 10)
			.firstElement()
				.subscribe(System.out::println);

		Observable.range(0, 10)
			.lastElement()
				.subscribe(System.out::println);
		
		Observable.range(0, 10)
			.take(2)
				.subscribe(System.out::println);
		
		Observable.range(0, 10)
			.takeLast(2)
				.subscribe(System.out::println);
		
		Thread.sleep(10000);
	}
}
