package com.github.ljtfreitas.rx.sample;

import io.reactivex.Observable;

public class RxSample1 {

	public static void main(String[] args) throws Exception {
		Observable.create(e -> e.onNext("value"))
			.doOnNext(System.out::println)
			.subscribe();

		Observable.create(e -> e.onError(new RuntimeException("Ooops")))
			.doOnError(Throwable::printStackTrace)
			.subscribe();

		Observable.create(e -> e.onComplete())
			.doOnComplete(() -> System.out.println("Completed..."))
			.subscribe();
	}
}
