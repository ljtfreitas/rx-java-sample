package com.github.ljtfreitas.rx.sample;

import io.reactivex.subjects.AsyncSubject;

public class RxSample14 {

	public static void main(String[] args) throws Exception {
		AsyncSubject<String> subject = AsyncSubject.create();

		subject.subscribe(s -> System.out.println("subscribe: " + s));

		subject.onNext("first");
		subject.onNext("second");
		subject.onNext("third");

		subject.onComplete();
	}
}
