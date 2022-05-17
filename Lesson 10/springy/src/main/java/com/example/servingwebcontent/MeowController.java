package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MeowController {

	@GetMapping("/meow")
	public String meow(@RequestParam(name="name", required=false, defaultValue="Meow!") String name, Model model) {
		model.addAttribute("name", name);
		return "meow";
	}

}