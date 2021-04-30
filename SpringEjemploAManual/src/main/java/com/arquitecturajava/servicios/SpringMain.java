package com.arquitecturajava.servicios;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * cliente ese señor instancia las clases creadas por ahora, para los ejemplos
 * @author Ricardo
 *
 */
public class SpringMain {
	
	public static void main(String ...args) {
		
		/**
		 * crear un contexto para Anotaciones de spring. es porque nuestras clases tienen configuraciones atraves de anotaciones y es la forma en la que spring las configura
		 * */
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext();
		/**
		 * se registra el archivo de configuracion en el contexto de la aplicacion
		 */
		contexto.register(SpringConfigurador.class);
		contexto.refresh();
		
		/**
		 * creo el bean de la clase Servicio, el bean es un archivo que funciona como singleton y que no se instancia nuevamente siempre, hacer la preuba
		 */
		Servicio miServicio = contexto.getBean(Servicio.class);
		miServicio.setSaludo(" Ricardo");
		System.out.println(miServicio.mensaje());
		
		/**
		 * como cargo el bean cargo la misma clase con sus variables definidas, esto ayuda a ahorrar ram en la creacion de neuvas varias cada vez que se crea aun new Object() o lo quew es lo mismo una instancia de la clase deseada
		 */
		Servicio miServicio2 = contexto.getBean(Servicio.class);
		System.out.println(miServicio2.mensaje());
		
		/**crea una nueva instancia de servicio que tiene sus variables nulas*/
		Servicio miServicio3 = new Servicio();
		System.out.println(miServicio3.mensaje());
		
		contexto.close();
	}
}
