package com.abc.s3.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.abc.s3.member.MemberDAO.";
	
	public int memberUpdate(MemberDTO memberDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"memberUpdate", memberDTO);
	}
	
	public int memberDelete(MemberDTO memberDTO)throws Exception{
		return sqlSession.delete(NAMESPACE+"memberDelete",memberDTO);
	}
	

	public int memberJoin(MemberDTO memberDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"memberJoin", memberDTO);
	
	}
	
	public MemberDTO memberLogin(MemberDTO memberDTO)throws Exception{
		memberDTO = sqlSession.selectOne(NAMESPACE+"memberLogin", memberDTO);
	
		return memberDTO;
	}
	

}
