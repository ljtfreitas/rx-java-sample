package com.github.ljtfreitas.rx.sample;

import io.reactivex.Maybe;

public class RxSample10 {

	public static void main(String[] args) throws Exception {
		Maybe.just("hello")
			.defaultIfEmpty("default value")
				.subscribe(System.out::println);
		
		Maybe.fromCallable(() -> null)
			.defaultIfEmpty("default value")
				.subscribe(System.out::println);
	}
}
