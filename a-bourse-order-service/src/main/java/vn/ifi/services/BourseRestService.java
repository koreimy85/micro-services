package vn.ifi.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@PropertySource("classpath:boostrap.properties")
@RestController
public class BourseRestService {
	@Value("${moi}")
	private String info;
	@RequestMapping("/info")
	public String appelMoi() {
		System.out.println("------------------");
		System.out.println("c'est moi");
		System.out.println("------------------");
		return info;
	}

}
