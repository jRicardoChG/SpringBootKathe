package com.arquitecturajava.springbootThymeLeaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * Servicio en este caso controla los datos obtenidos de algun lugar de persistencia en este caso lo creamos con la clase persona
 * Se crea de tipo servicio para que springboot cree el bean correspondiente par ala injeccion de dependencias
 * @author Ricardo
 *
 */
@Service
public class PersonaServicio {

	protected static List<Persona> listaPersonas = new ArrayList<>();
	
	/**
	 * bloque statico para inicializar la lista estatica persona
	 */
	static {
		
		Persona p1 = new Persona("perpe","dasdasd",12);
		Persona p2 = new Persona("12eqipu","dteter",13);
		
		listaPersonas.add(p1);
		listaPersonas.add(p2);
	}
	
	public List<Persona> obtenerPersonas(){
		return listaPersonas;		
	}
	
}
