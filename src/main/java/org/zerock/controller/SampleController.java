package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {
	
	@GetMapping("/input")
	public void doInput() {
		
	}	
	@PostMapping("/input")
	public void doInPost(String s1) {
		
		System.out.println(s1);
	}	

	@GetMapping("/guest")
	public void doGuest() {
		
	}
	
	@GetMapping("/manager")
	public void doManager() {
		
	}
	
	@GetMapping("/admin")
	public void doAdmin() {
		
	}
	
}
