package com.abc.s3.notice;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.abc.s3.MyAbstractTest;
import com.abc.s3.bankbook.BankBookDAO;
import com.abc.s3.bankbook.BankBookDTO;

public class NoticeDAOTest extends MyAbstractTest{
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	//@Test
	public void getListTest()throws Exception{
		List<NoticeDTO> ar = noticeDAO.getList();
		assertNotEquals(0, ar.size());
	}
	
	//@Test
	public void getSelectTest()throws Exception{
		NoticeDTO noticeDTO = noticeDAO.getSelect(null);
		assertNotNull(noticeDTO);
	}
	
	//@Test
	public void setInsertTest() throws Exception {
		Date onlyDate =new Date();
		
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setTitle("testest");
		noticeDTO.setWriter("id1");
		noticeDTO.setContents("contents");
		noticeDTO.setHit(0);
		noticeDTO.setRegdate(onlyDate);
		int result = noticeDAO.setInsert(noticeDTO);
		
		assertEquals(1, result);
	}

}
