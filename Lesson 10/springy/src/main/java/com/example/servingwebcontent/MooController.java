package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MooController {

	@GetMapping("/moo")
	public String moo(@RequestParam(name="name", required=false, defaultValue="Moo!") String name, Model model) {
		model.addAttribute("name", name);
		return "moo";
	}

}