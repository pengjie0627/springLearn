package com.hd123.tx.demo;

import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService {
	
	private AccountDao account;

	public void setAccount(AccountDao account) {
		this.account = account;
	}

	@Override
	public void transfer(final String from, final String to, final Double money) {
		account.outMoney(from, money);
		
		account.inMoney(to, money);
		
	}

}
