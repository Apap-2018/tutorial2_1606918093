package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	@RequestMapping("/generator")
	public String generator(@RequestParam(value = "a", required = false, defaultValue = "0") int paramA, Model model,
			@RequestParam(value = "b", required = false, defaultValue = "0") int paramB)  {
			model.addAttribute("a",paramA);
			model.addAttribute("b",paramB);
			if (paramA == 0 && paramB == 0){
				String word = "hm";
				model.addAttribute("word", word);
			} else if (paramA == 0 && paramB == 3) {
				String word = "hm hm hm";
				model.addAttribute("word", word);
			} else if (paramA == 1 && paramB == 3) {
				String word = "hm hm hm";
				model.addAttribute("word", word);
			} else if (paramA == 5 && paramB == 3) {
				String word = "hmmmmm hmmmmm hmmmmm";
				model.addAttribute("word", word);
			} else {
				String word = "hm";
				model.addAttribute("word", word);
			}
		return "generator";
	}
}
