package com.abc.s3.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.abc.s3.member.MemberDAO";
	
	public int memberUpdate(MemberDTO memberDTO)throws Exception{
		
	}
	
	public int memberDelete(MemberDTO memberDTO)throws Exception{
		
	}
	
	//memberJoin 데이터를 받아서 DB에 insert 하는 메서드
	public int memberWrite(MemberDTO memberDTO)throws Exception{
		int result = sqlSession.insert(NAMESPACE+"memberWrite", memberDTO);
		
		return result;
		
	}
	
	
	//login - id pw를 받아서 조회
	public MemberDTO memberWrite(MemberDTO memberDTO)throws Exception{
		memberDTO = sqlSession.selectOne(NAMESPACE+"memberSelect", memberDTO);
		
		return memberDTO;
	}

}
