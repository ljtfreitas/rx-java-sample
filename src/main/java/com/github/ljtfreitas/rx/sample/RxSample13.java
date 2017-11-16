package com.github.ljtfreitas.rx.sample;

import io.reactivex.subjects.BehaviorSubject;

public class RxSample13 {

	public static void main(String[] args) throws Exception {
		BehaviorSubject<String> subject = BehaviorSubject.create();

		subject.onNext("first");
		subject.subscribe(s -> System.out.println("first subscribe: " + s));
		subject.onNext("second");

		subject.subscribe(s -> System.out.println("second subscribe: " + s));
		subject.onNext("third");
	}
}
