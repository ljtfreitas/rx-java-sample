package com.github.ljtfreitas.rx.sample;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class RxSample4 {

	public static void main(String[] args) throws Exception {
		Observable<Long> first = Observable.interval(1000, TimeUnit.MILLISECONDS);
		
		Observable<String> second = Observable.just("second");

		// wait
		Observable.concat(Arrays.asList(first, second))
			.subscribe(System.out::println);

		// interleaving
		Observable.merge(first, second)
			.subscribe(System.out::println);

		Thread.sleep(5000);
	}
}
