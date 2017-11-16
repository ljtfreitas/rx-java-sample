package com.github.ljtfreitas.rx.sample;

import io.reactivex.Observable;

public class RxSample18 {

	public static void main(String[] args) throws Exception {
		Observable.range(0, 10)
			.reduce((a, b) -> a + b)
				.subscribe(System.out::println);

		Observable.range(0, 10)
			.scan((a, b) -> a + b)
				.subscribe(System.out::println);		
	}
}
