package vn.ifi;

import java.util.stream.Stream;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

import vn.ifi.entities.Societe;
import vn.ifi.entities.dao.SocieteRepository;
@EnableEurekaClient
@SpringBootApplication
public class ABourseSocieteServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(ABourseSocieteServiceApplication.class, args);
		SocieteRepository societeRepository=ctx.getBean(SocieteRepository.class);
		Stream.of("Pretomilex","Vinamilk","Vingroup","VIETNAM HAIR STAR COMPANY","LINYECO","UPS").forEach(s->societeRepository.save(new Societe(s)));
		societeRepository.findAll().forEach(s->System.out.println(s.getNomSociete()));
	}
	
}

