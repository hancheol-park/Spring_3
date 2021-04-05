package com.abc.s3.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.abc.s3.bankbook.BankBookDTO;
import com.abc.s3.board.BoardDTO;
import com.abc.s3.util.Pager;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("noticeDelete")
	public String setDelete(NoticeDTO noticeDTO,Model model)throws Exception{
		int result = noticeService.setDelete(noticeDTO);
		
		String message="삭제 실패";
		
		if(result>0) {
			message="삭제 성공";
		}
		model.addAttribute("msg", message);
		model.addAttribute("path", "./noticeList");
		
		return "common/commonResult";
	}
	
	@RequestMapping(value = "noticeUpdate", method = RequestMethod.POST)
	public String setUpdate(BoardDTO boardDTO,Model model)throws Exception{
		int result = noticeService.setUpdate(boardDTO);
		String message="등록 실패";
		
		if(result>0) {
			message="등록 성공";
		}
		model.addAttribute("msg", message);
		model.addAttribute("path", "./noticeList");
		
		return "common/commonResult";
	}
	
	@GetMapping("noticeUpdate")
	public ModelAndView setUpdate(BoardDTO boardDTO,ModelAndView mv)throws Exception{
		boardDTO = noticeService.getSelect(boardDTO);
		mv.addObject("dto", boardDTO);
		mv.addObject("board", "notice");
		mv.setViewName("board/boardUpdate");
		
		return mv;
	}
	
	@GetMapping("noticeSelect")
	public ModelAndView getSelect(BoardDTO boardDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		boardDTO = noticeService.getSelect(boardDTO);
		mv.addObject("dto", boardDTO);
		mv.addObject("board", "notice");
		mv.setViewName("board/boardSelect");
		
		return mv;
	}
	
//	@RequestMapping("noticeInsert")
//	public ModelAndView setInsert()throws Exception{
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("board/boardInsert");
//		mv.addObject("board","notice");
//		return mv;
//	}
//	
//	@RequestMapping(value = "noticeInsert", method = RequestMethod.POST)
//	public String setInsert(BoardDTO boardDTO, Model model)throws Exception{
//		int result = noticeService.setInsert(boardDTO);
//		
//		String message="등록 실패";
//		
//		if(result>0) {
//			message="등록 성공";
//		}
//		model.addAttribute("msg", message);
//		model.addAttribute("path", "./noticeList");
//		
//		return "common/commonResult";
//	}
	
	@RequestMapping("noticeList")
	public ModelAndView getList(Pager pager)throws Exception{
		ModelAndView mv = new ModelAndView();
		System.out.println(pager.getCurPage());
		
		List<BoardDTO> ar = noticeService.getList(pager);
		
		//List<NoticeDTO> ar = noticeService.getList(curPage);
		mv.addObject("list", ar);
		mv.setViewName("board/boardList");
		mv.addObject("board", "notice");
		mv.addObject("pager", pager);
		return mv;
	}

}
