package com.github.ljtfreitas.rx.sample;

import io.reactivex.subjects.ReplaySubject;

public class RxSample12 {

	public static void main(String[] args) throws Exception {
		ReplaySubject<String> subject = ReplaySubject.create();

		subject.subscribe(s -> System.out.println("first subscribe: " + s));
		subject.onNext("first");
		subject.onNext("second");
		
		subject.subscribe(s -> System.out.println("second subscribe: " + s));
		subject.onNext("third");

	}
}
