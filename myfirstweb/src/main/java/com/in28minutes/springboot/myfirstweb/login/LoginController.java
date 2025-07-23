package com.in28minutes.springboot.myfirstweb.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@SessionAttributes("name")
public class LoginController {
	
	private AuthenticationService authenticationService;

	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}
	@RequestMapping(value = "login", method=RequestMethod.GET)
	public String gotoLoginPage() {
		return "login";
	}
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
	
		if(authenticationService.authenticate(name, password))
		{
			model.put("name", name);
//			map.put("password", password);
			return "welcome";
			
		}		
		model.put("errorMessage", "유효하지않은 자격검증! 다시 시도해주세요");
		return "login";
	}
	

}
