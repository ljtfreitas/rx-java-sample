package com.github.ljtfreitas.rx.sample;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class RxSample3 {

	public static void main(String[] args) throws Exception {
		Observable<String> first = Observable.interval(1, TimeUnit.SECONDS)
			.map(v -> "first " + v);

		Observable<String> second = Observable.interval(2, TimeUnit.SECONDS)
			.map(v -> "second " + v);

		Observable<String> third = Observable.interval(3, TimeUnit.SECONDS)
			.map(v -> "third " + v);

		Observable.combineLatest(Arrays.asList(first, second, third),
			(values) -> Arrays.toString(values)) 
				.subscribe(System.out::println);
		
		Thread.sleep(10000);
	}
}
