package com.nguyentanthanh.multicontroller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@Controller
public class BootController {
	@RequestMapping("/boot")
	public ModelAndView showMVC() {
		ModelAndView mv = new ModelAndView("view_boot");
		return mv;
	}
}
