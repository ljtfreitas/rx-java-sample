package com.github.ljtfreitas.rx.sample;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class RxSample21 {

	public static void main(String[] args) throws Exception {
		Observable.create(e -> {
			e.onNext("[" + Thread.currentThread() + "]");
		})
		.subscribeOn(Schedulers.newThread())
			.subscribe(s -> System.out.println("Received " + s + " on " + Thread.currentThread()));

		Observable.create(e -> {
			e.onNext("[" + Thread.currentThread() + "]");
		})
		.observeOn(Schedulers.newThread())
			.subscribe(s -> System.out.println("Received " + s + " on " + Thread.currentThread()));
		
		Thread.sleep(5000);		
	}
}
