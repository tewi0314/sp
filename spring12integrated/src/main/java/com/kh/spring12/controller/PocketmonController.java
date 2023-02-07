package com.kh.spring12.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring12.dao.PocketmonDao;
import com.kh.spring12.dto.PocketmonDto;

@Controller
@RequestMapping("/pocketmon")
public class PocketmonController {
	@Autowired PocketmonDao pocketmonDao;
	
	@GetMapping("/insertInput")
	public String insert() {
		return "/WEB-INF/views/pocketmon/insertInput.jsp";
	}
	
	@PostMapping("/insertProcess")
	public String process(@ModelAttribute PocketmonDto pocketmonDto) {
		pocketmonDao.insert(pocketmonDto);
		return "redirect:insertFinish";
	}
	
	@GetMapping("/insertFinish")
	public String finish() {
		return "/WEB-INF/views/pocketmon/insertFinish.jsp";
	}
	
	@GetMapping("detail")
	public String detail(Model model, @RequestParam int no) {
		PocketmonDto pocketmonDto = pocketmonDao.selectOne(no);
		model.addAttribute("pocketmonDto", pocketmonDto);
		return "/WEB-INF/views/pocketmon/detail.jsp";
	}
}
