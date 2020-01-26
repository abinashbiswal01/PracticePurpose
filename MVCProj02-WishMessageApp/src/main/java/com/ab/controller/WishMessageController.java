package com.ab.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ab.service.WishService;

@Controller
public class WishMessageController {
	
	@Autowired
	private WishService service=null;
	
	@RequestMapping("/wish.htm")
	public String process(Map<String, Object> map) {
		String result;
		//use service
		result=service.generateWishMessage();
		map.put("wmsg", result);
		return "wish";
	}

}
