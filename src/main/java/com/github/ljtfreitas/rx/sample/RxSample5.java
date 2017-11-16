package com.github.ljtfreitas.rx.sample;

import io.reactivex.Observable;

public class RxSample5 {

	public static void main(String[] args) throws Exception {
		Observable.never()
			.subscribe();

		Observable.empty()
			.subscribe(
				System.out::println);
		
		Observable.error(new RuntimeException("oops.."))
			.subscribe(
					System.out::println,
					Throwable::printStackTrace);

		
	}
}
