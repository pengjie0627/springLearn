package com.hd123.tx.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void outMoney(String from, Double money) {
		// TODO Auto-generated method stub
		this.getJdbcTemplate().update("update new_account set money = money - ? where name = ?", money, from);
	}

	@Override
	public void inMoney(String to, Double money) {
		// TODO Auto-generated method stub
		this.getJdbcTemplate().update("update new_account set money = money + ? where name = ?", money, to);
	}

}
