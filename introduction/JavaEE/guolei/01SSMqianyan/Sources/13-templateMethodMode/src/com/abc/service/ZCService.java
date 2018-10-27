package com.abc.service;

public class ZCService extends DinnerService {

	@Override
	public void eat() {
		System.out.println("使用筷子进餐");
	}
	
	@Override
	public void pay() {
		System.out.println("使用微信支付");
	}

}
