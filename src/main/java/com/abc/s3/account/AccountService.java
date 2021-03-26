package com.abc.s3.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abc.s3.bankbook.BankBookDAO;
import com.abc.s3.bankbook.BankBookDTO;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO accountDAO;
	
	@RequestMapping("accountList")
	public List<AccountDTO> getList(AccountDTO accountDTO)throws Exception{
		return accountDAO.getList(accountDTO);
	}
	
	
}
