package com.abc.service;

import com.abc.dao.IAccountDao;
import com.abc.dao.IStockDao;
import com.abc.exceptions.BuyStockException;

public class BuyStockServiceImpl implements IBuyStockService {
	private IAccountDao adao;
	private IStockDao sdao;
	
	public void setAdao(IAccountDao adao) {
		this.adao = adao;
	}

	public void setSdao(IStockDao sdao) {
		this.sdao = sdao;
	}

	@Override
	public void openAccount(String aname, double money) {
		adao.insertAccount(aname, money);
	}

	@Override
	public void openStock(String sname, int count) {
		sdao.insertStock(sname, count);
	}

	@Override
	public void buyStock(String aname, double money, String sname, int amount) throws BuyStockException {
		boolean isBuy = true;
		// 银行账户减钱
		adao.updateAccount(aname, money, isBuy);
		
		if (1 == 1) {
			// 出现异常
			throw new BuyStockException("购买股票异常");
		}
		
		// 股票账户加股
		sdao.updateStock(sname, amount, isBuy);
	}

}
