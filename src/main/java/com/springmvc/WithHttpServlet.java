package com.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WithHttpServlet {
	@RequestMapping("/withhttp")
	public String withHttpMethond(HttpServletRequest request, HttpServletResponse response, Model model) {
		request.setAttribute("saysth", "hello there");
		request.setAttribute("redirect", request.getAttribute("redirect"));
		return "httppage";
	}

	/**
	 * 因为重定向也需要DispatcherServlet处理，因此需要一个返回值同名的RequestMapping处理请求
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String withRedirect(HttpServletRequest request, HttpServletResponse response, Model model) {
		request.setAttribute("redirect", "进入重定向的页面");
		System.out.println("-----测试重定向----");
		return "redirect:/withhttp";
	}
}
