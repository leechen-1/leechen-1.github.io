package com.abc.aop05;

/*
 *  异常分为两类：
 *  运行时异常：RuntimeException及其子类，称为运行时异常。
 *  编译时异常：Exception及其RuntimeException之外的子类，称为编译时异常。
 *  	      Checked Exception，受查异常
 *  这两种异常，哪种更严重？运行时异常更严重。
 *  
 */
public class UserException extends Exception {

	public UserException() {
		super();
	}

	public UserException(String message) {
		super(message);
	}
	
}
