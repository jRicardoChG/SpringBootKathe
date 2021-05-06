package com.arquitecturajava.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controladores en las vistas
 * @author Ricardo
 *
 */
@Controller
public class Controladores {

	@RequestMapping("/hola")
	public String saludo() {
		
		/**retorna la vista jsp registrada en el viewREsolver*/
		return "mensaje";
	}
}
