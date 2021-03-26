package com.abc.s3.account;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abc.s3.bankbook.BankBookDTO;

@Repository
public class AccountDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.abc.s3.account.AccountDAO.";
	
	public List<AccountDTO> getList(AccountDTO accountDTO)throws Exception{
		return sqlSession.selectList(NAMESPACE+"getList", accountDTO);
	}
	
	public int setInsert(AccountDTO accountDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setInsert",accountDTO);
	}
	
}
