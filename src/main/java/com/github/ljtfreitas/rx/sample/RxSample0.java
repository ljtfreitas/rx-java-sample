package com.github.ljtfreitas.rx.sample;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class RxSample0 {

	public static void main(String[] args) throws Exception {
		Observable.create(e -> e.onNext("value"))
			.subscribe(System.out::println);

		Observable.create(e -> e.onError(new RuntimeException("Ooops")))
			.subscribe(
				System.out::println,
				Throwable::printStackTrace);

		Observable.create(e -> e.onComplete())
			.subscribe(
				System.out::println,
				Throwable::printStackTrace,
				() -> System.out.println("Completed..."));

		Observable.create(e -> e.onComplete())
			.subscribe(
				System.out::println,
				Throwable::printStackTrace,
				() -> System.out.println("Completed..."));

		Observable.just("first", "second", "third")
			.subscribe(System.out::println);

		Observable.fromArray("first", "second", "third")
			.subscribe(System.out::println);
		
		Observable.fromIterable(Arrays.asList("first", "second", "third"))
			.subscribe(System.out::println);
		
		Observable.range(0, 10)
			.subscribe(System.out::println);

		Observable.intervalRange(0, 10, 3000, 1000, TimeUnit.MILLISECONDS)
			.subscribe(System.out::println);

		Observable.interval(2000, TimeUnit.MILLISECONDS)
			.subscribe(System.out::println);
		
		Observable.timer(2000, TimeUnit.MILLISECONDS)
			.subscribe(System.out::println);

		Observable.fromCallable(() -> "onNext")
			.subscribe(System.out::println);

		Thread.sleep(6000);
	}
}
