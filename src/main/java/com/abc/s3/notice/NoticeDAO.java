package com.abc.s3.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abc.s3.bankbook.BankBookDTO;

@Repository
public class NoticeDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.abc.s3.notice.NoticeDAO.";
	
	public int setUpdate(NoticeDTO noticeDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"setUpdate", noticeDTO);
	}
	
	public int setHitUpdate(NoticeDTO noticeDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"setHitUpdate", noticeDTO);
	}
	
	public int setDelete(NoticeDTO noticeDTO)throws Exception{
		return sqlSession.delete(NAMESPACE+"setDelete", noticeDTO);
	}
	
	public int setInsert(NoticeDTO noticeDTO)throws Exception{
		int result = sqlSession.insert(NAMESPACE+"setInsert", noticeDTO);
		return result;
	}


	public NoticeDTO getSelect(NoticeDTO noticeDTO)throws Exception{
		noticeDTO = sqlSession.selectOne(NAMESPACE+"getSelect", noticeDTO);
		return noticeDTO;
	}	

	public List<NoticeDTO> getList()throws Exception{
		return sqlSession.selectList(NAMESPACE+"getList");
	}
	
}
