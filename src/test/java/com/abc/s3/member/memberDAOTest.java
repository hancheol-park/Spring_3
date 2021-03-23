package com.abc.s3.member;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.abc.s3.MyAbstractTest;

public class memberDAOTest extends MyAbstractTest{

	@Autowired
	private MemberDAO memberDAO;
	
	//@Test
	public void setUpdateTest()throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id1");
		
		memberDTO = memberDAO.memberLogin(memberDTO);
		
		memberDTO.setName("New Poduct");
		
		int result = memberDAO.memberUpdate(memberDTO);
		assertEquals(1, result);
	}
	
	//@Test
	public void setDeleteTest()throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("swc03171");
		int result = memberDAO.memberDelete(memberDTO);
		
		assertEquals(1, result);
	}
	
	//@Test
	public void memberLoginTest()throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id1");
		memberDTO.setPw("pw1");
		memberDTO = memberDAO.memberLogin(memberDTO);
		assertNotNull(memberDTO);
	}
	
	@Test
	public void memberJoinTest() throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("Test1212");
		memberDTO.setPw("123");
		memberDTO.setName("test1212");
		memberDTO.setPhone("01010101010");
		memberDTO.setEmail("sss@nsnas.com");
		int result = memberDAO.memberJoin(memberDTO);
		assertEquals(1, result);
	}

}
