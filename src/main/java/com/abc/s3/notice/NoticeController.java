package com.abc.s3.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abc.s3.member.MemberService;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;

	
	@RequestMapping("noticeList")
	public void getList(Model model)throws Exception{
		List<NoticeDTO> ar = noticeService.getList();
		model.addAttribute("list",ar);
	}
}
