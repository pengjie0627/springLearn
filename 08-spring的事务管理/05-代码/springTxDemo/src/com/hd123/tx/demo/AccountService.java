package com.hd123.tx.demo;

public interface AccountService {
	/**
	 * 
	 * @param from 付款人
	 * @param to 收款人
	 * @param money 多少钱
	 */
	public void transfer(String from, String to, Double money);
}
