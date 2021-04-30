package com.springInitializr.servicios;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring facilita las cosas para inyectar las clases bean
 * para este caso se implementa la itnerface {@link CommandLineRunner} para poder ejecutar la aplicacion por consola
 * @author Ricardo
 *
 */
@SpringBootApplication
public class ServiciosApplication implements CommandLineRunner {

	private static final Logger LOG = Logger.getLogger(ServiciosApplication.class.getName()); 
	/**inyecto el bean de la case Servicio*/
	@Autowired
	private Servicio miServicio;
	
	/**
	 * se ejecuta el run de commandline, no es necesario implementar la interface si no s eentiende el ocncepto se puede crear el metodo run sin implemtnar la interface
	 * La interface solo e sun convenio de desarrollo para crear aplciaciones organizadas
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * este comando ejecuta la clase ServiciosApplication considerandola una clase que implemnta Commandline
		 * En teoria solo elementos estaticos pueden ser ejecutados en metodos estaticos pero ne este caso run e sun metodo publico normal y static void main no lo es
		 * SpringApplication nos permite atraves del metodo run usar las inyecciones de beans de las calses que usamos
		 * */
		SpringApplication.run(ServiciosApplication.class, args);
		miEjemplo();
		
		
	}


	/**
	 * ejemplo usando command line par acorer la aplciacion de linea de comandos
	 * usar este run nos evita las lineas AnnotationConfigApplicationContext para crear el contexto para usar los beans 
	 * {@link CommandLineRunner} es una interface que funciona bajo el mismo ocntexto de las clases con la apnotacion SpringBootApplication
	 * **/
	@Override
	public void run(String... args) throws Exception {
		miServicio.setSaludo("Ricardo");
		String variable = "Hola";
		LOG.info(variable);
		String saludo = miServicio.mensaje(); 
		LOG.info(saludo);
	}
	
	public static void miEjemplo()
	{
//		miServicio no se puede usar
		Servicio miServicio2 = new Servicio();
		miServicio2.setSaludo("Kathe");
		String saludo = miServicio2.mensaje(); 
		LOG.info(saludo);
		LOG.info(saludo);
	}
	
	

}
