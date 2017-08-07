package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class URLPartten {
	@RequestMapping("/web/{userId}/{language}/{nature}")
	public String writeToPage(Model model, @PathVariable(value = "userId") Integer id,
			@PathVariable(value = "language") String language, @PathVariable(value = "nature") String nature) {
		model.addAttribute("userId", id);
		model.addAttribute("language", language);
		model.addAttribute("nature", nature);
		return "pathPage";
	}

	@RequestMapping(value = "getResopnsBody")
	@ResponseBody
	public String getBody(Model model) {
		StringBuilder body = new StringBuilder();
		body.append("this is ").append("response body");
		return body.toString();
	}

	@RequestMapping(value = "getResponseObject")
	@ResponseBody
	public User getObject(Model model) {
		User user = new User();
		user.setId(123);
		user.setUsername("Jack");
		return user;
	}
}
