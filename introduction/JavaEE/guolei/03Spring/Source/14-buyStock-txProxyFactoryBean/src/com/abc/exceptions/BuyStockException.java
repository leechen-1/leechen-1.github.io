package com.abc.exceptions;

// 受查异常
public class BuyStockException extends Exception {

	public BuyStockException() {
		super();
	}

	public BuyStockException(String message) {
		super(message);
	}
	
}
