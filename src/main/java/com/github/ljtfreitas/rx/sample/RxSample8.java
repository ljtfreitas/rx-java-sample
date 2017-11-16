package com.github.ljtfreitas.rx.sample;

import io.reactivex.Single;

public class RxSample8 {

	public static void main(String[] args) throws Exception {
		Single.just("hello")
			.subscribe(System.out::println);
		
		Single.error(new RuntimeException("Ops"))
			.subscribe(
				System.out::println, //onNext
				Throwable::printStackTrace); //onError
	}
}
