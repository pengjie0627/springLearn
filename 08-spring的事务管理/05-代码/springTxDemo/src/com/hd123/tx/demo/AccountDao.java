package com.hd123.tx.demo;

public interface AccountDao {
	/**
	 * 
	 * @param from 把转账人的钱扣掉
	 * @param money
	 */
	public void outMoney(String from, Double money);
	/**
	 * 
	 * @param to 把收款人的钱加上
	 * @param money
	 */
	public void inMoney(String to, Double money);
}
