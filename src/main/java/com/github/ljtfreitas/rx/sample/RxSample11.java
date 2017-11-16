package com.github.ljtfreitas.rx.sample;

import io.reactivex.subjects.PublishSubject;

public class RxSample11 {

	public static void main(String[] args) throws Exception {
		PublishSubject<String> subject = PublishSubject.create();

		subject.subscribe(s -> System.out.println("first subscribe: " + s));
		subject.onNext("first");
		subject.onNext("second");
		
		subject.subscribe(s -> System.out.println("second subscribe: " + s));
		subject.onNext("third");

	}
}
