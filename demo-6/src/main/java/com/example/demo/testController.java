package com.example.demo;

import org.springframework.data.domain.AfterDomainEventPublication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
	@RequestMapping("/test")
	public String method() {
		//参考ページhttps://codepen.io/ueokande/pen/VeRBvr
		return "test";
	}
}
