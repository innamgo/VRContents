package com.vrcon;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/three")
public class TestController {

	@RequestMapping(value="WebGL_Ani_Cloth", method=RequestMethod.GET)
	public String prepare(Model model) {
		model.addAttribute("foo", "bar");
		model.addAttribute("fruit", "apple");
		return "/three/WebGL_Ani_Cloth";
	}
}
