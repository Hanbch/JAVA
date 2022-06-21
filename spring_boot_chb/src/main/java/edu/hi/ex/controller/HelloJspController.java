package edu.hi.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloJspController {

		@GetMapping("/hello")
		public String hello() {
			return "hello";
		}
		
		@GetMapping("/mind")
		public String mind() {
			return "mind";
		}

}
