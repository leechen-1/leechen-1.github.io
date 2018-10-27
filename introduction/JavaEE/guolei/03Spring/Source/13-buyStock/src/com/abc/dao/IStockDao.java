package com.abc.dao;

public interface IStockDao {

	void insertStock(String sname, int count);

	void updateStock(String sname, int amount, boolean isBuy);

}
