package com.arquitecturajava.springbootThymeLeaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controladores, en la arquitectura C los "servicios" son los controaldores que intercambian informacio nentre los procesadores "negocio o modelo" y las vistas (las petitciones htttp de la arquitecruea rest)
 * Los controladores en spring controlan las vistas, los metodos que retornan estan ligados a un template configurado en resources/templates
 * @author Ricardo
 *
 */
@Controller
public class PersonaControlador {

	@Autowired
	private PersonaServicio miServicio;
	
	/**
	 * Model es el objeto de intercambio entre el controlador y la vista
	 * le cargamos los valores que tenemos staticos en la clase persona
	 * El return indica el folder dentro de la carpeta resources/templates/(ruta en el return)  donde estan las vistas
	 * @param modelo
	 * @return
	 */
	@RequestMapping("/personas/lista")
	public String mostrarPersonas(Model modelo) {
		modelo.addAttribute("lista",miServicio.obtenerPersonas());
		return "personas/lista";
	}

	@RequestMapping("/")
	public String saludo() {
		return "holaMundo";
	}

	
}
