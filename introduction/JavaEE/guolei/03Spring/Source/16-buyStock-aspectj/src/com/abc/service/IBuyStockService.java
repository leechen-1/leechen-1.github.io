package com.abc.service;

import com.abc.exceptions.BuyStockException;

public interface IBuyStockService {
	void openAccount(String aname, double money);
	void openStock(String sname, int count);
	
	void buyStock(String aname, double money, String sname, int amount)  throws BuyStockException;
}
