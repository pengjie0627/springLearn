package com.hd123.tx.demo;
import org.springframework.transaction.annotation.Transactional;
// 这里可以配置一些事务的属性。比如事务的隔离级别、传播行为、超时等等
//@Transactional(isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRED)
@Transactional
public class AccountServiceImpl implements AccountService {
	
	private AccountDao account;

	public void setAccount(AccountDao account) {
		this.account = account;
	}

	@Override
	public void transfer(final String from, final String to, final Double money) {
		account.outMoney(from, money);
		int a = 1/0;
		account.inMoney(to, money);
		
	}

}
