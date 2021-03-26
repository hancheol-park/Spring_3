package com.abc.s3.account;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.abc.s3.MyAbstractTest;


public class accountDAOTest extends MyAbstractTest{

	@Autowired
	private AccountDAO accountDAO;
	
	@Test
	public void getListTest()throws Exception{
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setId("id1");
		
		List<AccountDTO> ar =accountDAO.getList(accountDTO);
		
		assertNotEquals(0, ar.size());
	}
	
	public void setInsertTest()throws Exception{
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.getAccountNumber();
		accountDTO.getAccountBalance();
		accountDTO.getBookNumber();
	}
}
