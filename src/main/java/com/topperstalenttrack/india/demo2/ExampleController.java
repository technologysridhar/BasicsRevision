package com.topperstalenttrack.india.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
 
@RestController
public class ExampleController { 
		@GetMapping("/kid")
		@CrossOrigin(origins="*")
		public String sayKid(){
			return "I am Kid";
				
		}

		@CrossOrigin(origins="*")
		@GetMapping("/old") 
		public String sayOld(){
			return "I am Old"; 
		} 
}
