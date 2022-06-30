package cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@ControllerAdvice
public class ControllerAdvisor {

	
	@ExceptionHandler(SucursalNoTrobadaException.class)
	public String gestioSucursalNoTrobadaException(SucursalNoTrobadaException e, WebRequest request, Model model, RedirectAttributes attribute) {
		attribute.addFlashAttribute("exception", "No existeix cap sucursal amb aquest id");
		return "redirect:/sucursal/getAll";
	}
	
	
	
	
}
