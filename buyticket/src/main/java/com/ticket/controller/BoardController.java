package com.ticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//-------------------------------------------------------------------------------------
// public class BoardController
//-------------------------------------------------------------------------------------
@Controller
@RequestMapping("/")
public class BoardController {
	
	//-------------------------------------------------------------------------------------
	// 인덱스 메인 화면
	//-------------------------------------------------------------------------------------
	@GetMapping("/index")
	public void index(Model model) {
		
	}
	
}
