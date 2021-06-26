package com.kstudy.exception;

/**
 * 커스텀 비예외검사 exception (unchecked exception) 을 만든다.
 * 비예외검사 / 예외검사의 차이는 무엇인지 직접 조사해볼것..
 */
public class MemberNotFoundException extends RuntimeException {

    public MemberNotFoundException() { }

    public MemberNotFoundException(String message) {
        super(message);
    }
}
