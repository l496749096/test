package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.MyPage;

@Controller
public class TestController {
	@RequestMapping("/")
	public String index(MyPage page){
		   return "index";
	}
   @RequestMapping("list")
   public String page(MyPage page){
	   return "index";
   }
}
