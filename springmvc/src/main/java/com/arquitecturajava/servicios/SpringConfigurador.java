package com.arquitecturajava.servicios;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Esta calse configuradora define las configuraciones de las clases del paquete
 * @author Ricardo
 *
 */
@Configuration
@ComponentScan({"com.arquitecturajava.servicios","com.arquitecturajava.controladores"})
public class SpringConfigurador {

	/**
	 * Este Bean define la ruta en la cual se configuran las vistas que se crean y el formato de las mismas
	 * @return
	 */
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolutor = new InternalResourceViewResolver();
		/**
		 * soporte jstl
		 */
		viewResolutor.setViewClass(JstlView.class);
		viewResolutor.setExposeContextBeansAsAttributes(true);
		viewResolutor.setPrefix("WEB-INF/vistas/");
		viewResolutor.setSuffix(".jsp");
		return viewResolutor;
		
	}
}
