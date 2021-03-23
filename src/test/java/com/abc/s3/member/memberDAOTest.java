package com.abc.s3.member;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class memberDAOTest {

	@Autowired
	private MemberDAO memberDAO;
	
	//@Test
	public void setUpdateTest()throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id1");
		
		memberDTO = memberDAO.memberSelect(memberDTO);
		
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
		public void memberSelectTest()throws Exception{
			MemberDTO memberDTO = memberDAO.memberSelect(null);
			assertNotNull(memberDTO);
		}
	
	//@Test
	public void getListTest()throws Exception{
		List<MemberDTO> ar = memberDAO.getList();
		assertNotEquals(0, ar.size());
	}
	
	//@Test
//	public void getSelectTest()throws Exception{
//		MemberDTO memberDTO = memberDAO.memberSelect(null);
//		assertNotNull(memberDTO);
//	}
	
	@Test
	public void memberWriteTest() throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("Test1212");
		memberDTO.setPw("123");
		memberDTO.setName("test1212");
		memberDTO.setPhone("01010101010");
		memberDTO.setEmail("sss@nsnas.com");
		int result = memberDAO.memberWrite(memberDTO);
		assertEquals(1, result);
	}

}
