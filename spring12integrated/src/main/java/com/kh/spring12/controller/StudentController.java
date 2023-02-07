package com.kh.spring12.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring12.dao.StudentDao;
import com.kh.spring12.dto.StudentDto;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired StudentDao studentDao;
	
	@GetMapping("/insert")
	public String insert() {
		return "/WEB-INF/views/student/insert.jsp";
	}
	
	@PostMapping("/insert")
	public String insertProcess(@ModelAttribute StudentDto studentDto) {
		studentDao.insert(studentDto);
		return "redirect:insertFinish";
	}
	
	@GetMapping("/insertFinish")
	public String insertFinish() {
		return "/WEB-INF/views/student/insertFinish.jsp";
	}
	
	@GetMapping("/detail")
	public String detail(Model model, @RequestParam int n) {
		StudentDto studentDto = studentDao.selectOne(n);
		model.addAttribute("studentDto", studentDto);
		return "/WEB-INF/views/student/detail.jsp";
	}
	
	@GetMapping("/delete")
	public String delete(Model model, @RequestParam int n) {
		studentDao.delete(n);
		return "/WEB-INF/views/student/delete.jsp";
	}
	
	@GetMapping("/selectList")
	public String selectList(Model model) {
		List<StudentDto> list = studentDao.selectList();
		StringBuffer buffer = new StringBuffer();
		for(StudentDto dto:list) {
			buffer.append(dto.toString());
			buffer.append("<br>");
		}
		String s = buffer.toString();
		model.addAttribute("s", s);
		return "/WEB-INF/views/student/select.jsp";
	}
}
