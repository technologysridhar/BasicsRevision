package com.topperstalenttrack.india.demo2;

 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class ExampleController {
 
 
	 @RequestMapping(value="/cat")
	 public String sayCat(){
		 return "I am Cat";
	 }
 
 
	@RequestMapping(value="/dog")
	 public String sayDog(){
		 return "I am dog";
	 }
 
 
 @RequestMapping(value="/monkey")
	 public String sayMonkey(){
		 return "I am Monkey";
	 }
 
}
