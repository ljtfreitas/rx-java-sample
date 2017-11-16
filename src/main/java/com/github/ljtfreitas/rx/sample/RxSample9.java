package com.github.ljtfreitas.rx.sample;

import io.reactivex.Completable;

public class RxSample9 {

	public static void main(String[] args) throws Exception {
		Completable.complete()
			.subscribe(() -> System.out.println("onComplete"));
		
		Completable.error(new RuntimeException("Ops"))
			.subscribe(
				() -> System.out.println("onComplete"), //onNext
				Throwable::printStackTrace); //onError
		
		Completable.fromCallable(() -> "bla")
			.subscribe(() -> System.out.println("onComplete"));
		
		Completable.fromRunnable(() -> System.out.println("do something..."))
			.subscribe(() -> System.out.println("onComplete"));
	}
}
