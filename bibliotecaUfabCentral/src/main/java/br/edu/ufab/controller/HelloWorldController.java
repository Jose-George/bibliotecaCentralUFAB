package br.edu.ufab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("greeting", "Hello World from Spring 4 MVC");
		return "welcome";
	}

	@RequestMapping(value = "/helloagain", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
		return "welcome";
	}

	@RequestMapping("/olaMundoSpring")
	public String execute() {
		System.out.println("Executando	a	lógica	com	Spring	MVC");
		return "ok";
	}

	@RequestMapping("/index")
	public String executeTelas() {
		System.out.println("Executando	a	lógica	com	Spring	MVC");
		return "principal";
	}
}