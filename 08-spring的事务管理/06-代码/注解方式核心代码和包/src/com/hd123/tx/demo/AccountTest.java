package com.hd123.tx.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountTest {
	
	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test
	public void test(){
		accountService.transfer("hxr", "ckj", 2000d);
	}
}
