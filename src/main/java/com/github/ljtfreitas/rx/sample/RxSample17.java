package com.github.ljtfreitas.rx.sample;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class RxSample17 {

	public static void main(String[] args) throws Exception {
		Observable.range(0, 10)
			.window(3)
				.subscribe(window -> 
					window.toList().subscribe(System.out::println));
		
		Observable.interval(2, TimeUnit.SECONDS)
			.window(3)
				.subscribe(window -> 
					window.toList().subscribe(System.out::println));

		Observable.interval(1, TimeUnit.SECONDS)
			.window(5, TimeUnit.SECONDS)
				.subscribe(window -> 
					window.toList().subscribe(System.out::println));
		
		Thread.sleep(15000);
		
	}
}
