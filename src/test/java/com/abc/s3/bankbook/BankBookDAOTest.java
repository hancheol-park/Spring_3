package com.abc.s3.bankbook;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.abc.s3.MyAbstractTest;
import com.abc.s3.bankbook.BankBookDAO;
import com.abc.s3.bankbook.BankBookDTO;

public class BankBookDAOTest extends MyAbstractTest{
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	@Test
	public void setWriteTest() throws Exception {
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookName("test");
		bankBookDTO.setBookRate(0.12);
		bankBookDTO.setBookSale("Y");
		int result = bankBookDAO.setWrite(bankBookDTO);
		
		assertEquals(1, result);
	}

}
