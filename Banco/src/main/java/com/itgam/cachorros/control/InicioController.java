package com.itgam.cachorros.control;

import java.sql.SQLException;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itgam.cachorros.modelo.Cliente;
import com.itgam.cachorros.modelo.Transaccion;
import com.itgam.cachorros.service.ClienteService;
import com.itgam.cachorros.service.TransaccionService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class InicioController {
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private TransaccionService transaccionService;
	
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
	public String bancaPost(@ModelAttribute("cliente") Cliente obj, Model model) throws SQLException {
		System.out.println("Entra al post");
		
		Integer resultado = this.clienteService.acceso(obj);
		
		if(resultado.equals(0)){
			return "redirect:/bancaenlinea";
		}
		else{
			return "redirect:/bancaenlinea/inicio";
			//model.addAttribute("lista_transaccion", resultado);
			//return "operacion";
		}
	}
	
	@RequestMapping(value = "/bancaenlinea/inicio", method = RequestMethod.GET)
	public String bancaGet(Model model) throws SQLException {
		System.out.println("Entra al get");
		Date fecha = new Date();
		model.addAttribute("lista_transaccion", this.transaccionService.list_Transaccion("2015-"+(fecha.getMonth()+1)+"-"+fecha.getDate()));
		return "operacion";
	}
	
	@RequestMapping(value = "/bancaenlinea/operaciones", method = RequestMethod.GET)
	public String transaccionGet(Model model) throws SQLException {
		return "transaccion";
	}
	
	@RequestMapping(value = "/bancaenlinea/operaciones/transfencia", method = RequestMethod.POST)
	public String transferencia(@ModelAttribute("transaccion") Transaccion obj) throws SQLException {
		System.out.println(obj.getiIdCuenta());
		System.out.println(obj.getiIdCuenta2());
		System.out.println(obj.getMonto());
		System.out.println(this.transaccionService.transferencia(obj));
		return "transaccion";
	}
	
}
