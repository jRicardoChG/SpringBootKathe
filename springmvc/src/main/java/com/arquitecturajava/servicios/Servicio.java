package com.arquitecturajava.servicios;

import org.springframework.stereotype.Service;

/**
 * Primer Servicio spring.
 * Se usan antaciones @Service para indicar que es un servicio de salida
 * @author Ricardo
 *
 */
@Service
public class Servicio {

	private String saludo;
	
	public String mensaje() {
		return "Hola ".concat(this.saludo==null?"defecto":this.saludo);
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
}
