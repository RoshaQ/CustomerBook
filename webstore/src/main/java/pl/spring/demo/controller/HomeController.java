package pl.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.spring.demo.constants.ModelConstans;
import pl.spring.demo.constants.ViewNames;

@Controller
public class HomeController {
	
	private static final String INFO_TEXT = "Baza danych klientow";
	private static final String WELCOME_TEXT = "Witaj na stronie";
	
	@RequestMapping("/")
	public final String homePage(final Model model){
		model.addAttribute(ModelConstans.GREETING, WELCOME_TEXT);
		model.addAttribute(ModelConstans.INFO,INFO_TEXT);
		return ViewNames.WELCOME;
	}

}
