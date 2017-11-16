package com.github.ljtfreitas.rx.sample;

import io.reactivex.Observable;

public class RxSample6 {

	public static void main(String[] args) throws Exception {
		Observable<Integer> first = Observable.range(0, 2);
		
		Observable<String> second = Observable.just("one");

		Observable.zip(first, second,
				(a, b) -> a + " - " + b)
			.subscribe(System.out::println);
	}
}
