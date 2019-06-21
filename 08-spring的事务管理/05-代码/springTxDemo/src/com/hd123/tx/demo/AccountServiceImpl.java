package com.hd123.tx.demo;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService {
	
	private AccountDao account;

	public void setAccount(AccountDao account) {
		this.account = account;
	}
	
	private TransactionTemplate template;

	public void setTemplate(TransactionTemplate template) {
		this.template = template;
	}

	@Override
	public void transfer(final String from, final String to, final Double money) {
		template.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				account.outMoney(from, money);
			
				account.inMoney(to, money);
			}
		});
		
	}

}
