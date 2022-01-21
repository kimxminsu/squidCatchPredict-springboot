package com.example.first_project.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.first_project.model.Data;

import com.example.first_project.service.DataService;

@Controller
public class HomeController {

	@Autowired
	private DataService dataService;
	
	@GetMapping("/")
	public String home(Model model) {
		List<Data> data = dataService.findAll();
		model.addAttribute("data", data);
		return "index";
	}
	
	@GetMapping("/role")
	public String role(Model model) {
		List<Data> data = dataService.findAll();
		model.addAttribute("data", data);
		return "index2";
	}
	
	
	


	// 전체보기-다른페이지
//	@GetMapping("list")
//	public String list(Model model) {
//		List<Data> lists = dataService.findAll();
//		model.addAttribute("lists", lists);
//		return "result1";
//	}
}
