package com.github.ljtfreitas.rx.sample;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class RxSample2 {

	public static void main(String[] args) throws Exception {
		Observable<String> first = Observable.timer(5000, TimeUnit.MILLISECONDS)
			.map(v -> "first " + v);

		Observable<String> second = Observable.timer(4000, TimeUnit.MILLISECONDS)
			.map(v -> "second " + v);

		Observable<String> third = Observable.timer(3000, TimeUnit.MILLISECONDS)
			.map(v -> "third " + v);

		Observable.amb(Arrays.asList(first, second, third))
			.subscribe(System.out::println);

		Thread.sleep(6000);
	}
}
