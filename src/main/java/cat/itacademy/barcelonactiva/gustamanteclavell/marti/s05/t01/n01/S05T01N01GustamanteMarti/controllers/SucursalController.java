package cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.model.dto.SucursalDTO;
import cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.model.services.SucursalService;
import cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.utils.Paisos;

@Controller
@RequestMapping("/sucursal")
public class SucursalController {

	
	@Autowired
	SucursalService sucursalService;
	
	@GetMapping("/getAll")
	public String llistarSucursals(Model model) {
		List<SucursalDTO> llistaSucursals = sucursalService.getAll();
		model.addAttribute("sucursals",llistaSucursals);
		model.addAttribute("titol","Llista de Sucursals");
		
		return "/views/sucursals/llistar";
	}
	
	
	
	@GetMapping("/getOne/{id}")
	public String llistarSucursal(@PathVariable("id") int id, Model model) {
		SucursalDTO sucursal = sucursalService.getOneDTO(id);
		model.addAttribute("sucursals",sucursal);
		model.addAttribute("titol","Sucursal amb Id: " + id);
		
		return "/views/sucursals/llistar";
	}
	
	
	
	@GetMapping("/add")
	public String crearSucursal(Model model) {
		
		Sucursal sucursal = new Sucursal();
		model.addAttribute("titol","Formulari: Nova Sucursal");
		model.addAttribute("sucursal",sucursal);
		model.addAttribute("paisos",Paisos.getLlista());
		return "/views/sucursals/crear";
	}
	
	
	
	@PostMapping("/save")
	public String guardar(@Valid @ModelAttribute Sucursal sucursal, BindingResult result, Model model, RedirectAttributes attribute) {
		
		if (result.hasErrors()) {
			
			List<String> llistaPaisos = Paisos.getLlista();
			
			model.addAttribute("titol","Formulari: Nova Sucursal");
			model.addAttribute("sucursal",sucursal);
			model.addAttribute("paisos",llistaPaisos);
			return "/views/sucursals/crear";
		}
		
		sucursalService.add(sucursal);
		attribute.addFlashAttribute("success","Sucursal guardada correctament");
		return "redirect:/sucursal/getAll";
	}
	
	
	@GetMapping("/update/{id}")
	public String ModificarSucursal(@PathVariable("id") int id, Model model) {
		Sucursal sucursal = sucursalService.getOne(id);
		model.addAttribute("titol","Formulari: Modificar sucursal");
		model.addAttribute("sucursal",sucursal);
		model.addAttribute("paisos",Paisos.getLlista());
		
		return "/views/sucursals/crear";
	}
	
	
	@GetMapping("/delete/{id}")
	public String EliminarSucursal(@PathVariable("id") int id, RedirectAttributes attribute) {
		sucursalService.delete(id);
		attribute.addFlashAttribute("warning","Sucursal eliminada correctament");
		
		return "redirect:/sucursal/getAll";
	}
	
	
}
