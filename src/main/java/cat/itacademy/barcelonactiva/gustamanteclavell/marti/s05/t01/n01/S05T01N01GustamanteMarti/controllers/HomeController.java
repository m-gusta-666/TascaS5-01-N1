package cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

	
	@GetMapping({"/home","/index","/"})
	public String index() {
		return "home";
	}
}
