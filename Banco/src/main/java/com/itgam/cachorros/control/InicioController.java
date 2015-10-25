package com.itgam.cachorros.control;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itgam.cachorros.modelo.Cliente;
import com.itgam.cachorros.service.ClienteService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class InicioController {
	
	@Autowired
	private ClienteService clienteService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "inicio";
	}
	
	@RequestMapping(value = "/bancaenlinea", method = RequestMethod.GET)
	public String banca(Locale locale, Model model) {
		System.out.println("Entra al get banco en linea");
		return "banca";
	}
	
	@RequestMapping(value = "/bancaenlinea/login", method = RequestMethod.POST)
	public String bancaPost(@ModelAttribute("cliente") Cliente obj) {
		System.out.println("Entra al post");
		System.out.println(obj.getcUsuario());
		System.out.println(obj.getcPassword());
		
		this.clienteService.add_Cliente(obj);
		
		return "operacion";
	}
	
}
