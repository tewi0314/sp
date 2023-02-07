package com.kh.spring12.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring12.dao.SubjectDao;
import com.kh.spring12.dto.SubjectDto;

@Controller
//이 부분은 무조건 @RequestMapping으로 지정
@RequestMapping("/subject")
public class SubjectController {
	@Autowired SubjectDao subjectDao;
	
	@GetMapping("/insertInput")
	public String insert() {
		return "/WEB-INF/views/subject/insertInput.jsp";
	}
	
	@PostMapping("/insertProcess")
	public String process(@ModelAttribute SubjectDto subjectDto) {
		subjectDao.insert(subjectDto);
		return "redirect:insertFinish";
	}
	
	@GetMapping("/insertFinish")
	public String finish() {
		return "/WEB-INF/views/subject/insertFinish.jsp";
	}
	
	@GetMapping("/detail")
	public String detail(Model model, @RequestParam int n) {
		model.addAttribute("subjectDto", subjectDao.selectOne(n));
		return "/WEB-INF/views/subject/detail.jsp";
	}
}
