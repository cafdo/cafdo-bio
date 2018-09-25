package co.cafdo.profile.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import co.cafdo.profile.mdw.util.TorreUtil;

@SpringBootApplication
@ComponentScan("co.cafdo.profile.web")
public class Application {

	
	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		TorreUtil tu = new TorreUtil();
		tu.connectService("https://bio.torre.co/api/bios/cafdo/jobs");
	}
}
