package com.github.ljtfreitas.rx.sample;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class RxSample22 {

	public static void main(String[] args) throws Exception {
		Observable.interval(1, TimeUnit.MICROSECONDS)
			.map(v -> "value " + v)
			.subscribe(s -> {
				Thread.sleep(5000);
				System.out.println(s);
			});
	}
}
