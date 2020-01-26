package com.ab.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ab.command.LoginCommand;
import com.ab.dto.LoginDTO;
import com.ab.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService service;
	
	@RequestMapping(value="/home.htm",method=RequestMethod.GET)
	public String showLoginForm(@ModelAttribute("loginCmd") LoginCommand cmd) {
		return "login";
	}
	
	@RequestMapping(value="/home.htm",method=RequestMethod.POST)
	public String processLoginForm(Map<String, String> map ,@ModelAttribute("loginCmd") LoginCommand cmd) {
		String result=null;
		LoginDTO dto=null;
		
		//convert cmd to dto
		dto=new LoginDTO();
		BeanUtils.copyProperties(cmd, dto);
		
		result=service.authenticate(dto);
		
		map.put("resultMsg", result);
		return "result";
	}
}
