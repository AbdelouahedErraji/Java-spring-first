package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import metier.IMetier;

public class PresAvecSpring {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		IMetier metie = ctx.getBean(IMetier.class);
		System.out.println(metie.calcul());
	}

}
