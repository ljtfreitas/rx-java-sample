package com.github.ljtfreitas.rx.sample;

import io.reactivex.Observable;

public class RxSample16 {

	public static void main(String[] args) throws Exception {
		Observable.range(0, 10)
			.groupBy(n -> n % 2 == 0 ? "even" : "odd")
				.subscribe(group -> 
					group.toList().subscribe(list -> System.out.println(group.getKey() + ":" + list)));
	}
}
