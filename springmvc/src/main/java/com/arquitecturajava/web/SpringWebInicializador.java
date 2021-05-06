package com.arquitecturajava.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.arquitecturajava.servicios.SpringConfigurador;

/**
 *  Este inicializador registra un servlet que se encargue de las peticiones web y una el resto de componentes spring
 *  En este caso e sun contexto tipo web
 * @author Ricardo
 *
 */
public class SpringWebInicializador implements WebApplicationInitializer{

	/***
	 * cuando la aplicacion se inicie, lo mismo que el primer ejemplo inicializo el contexto del proyecto tipo spring, un unico contexto par ala aplicacion
	 */
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext contexto = new AnnotationConfigWebApplicationContext();
		contexto.register(SpringConfigurador.class);
		/**
		 * le defino al contexto el contexto web del servlet
		 * */
		contexto.setServletContext(servletContext);
		
		/**
		 * se requiere dejar el servlet como controlador frontal que depche toda sals peticiones alas vistas
		 * es como crear un server listener en nodejs, es quien recibe las epticiones y se les define una url
		 */
		ServletRegistration.Dynamic servlet = servletContext.addServlet("despachador", new DispatcherServlet(contexto));
		/**
		 * que s eprenda al iniciar la aplicaicon
		 */
		servlet.setLoadOnStartup(1);
		/**
		 * defino la ruta base del servlet
		 */
		servlet.addMapping("/");
	}

}
