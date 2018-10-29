package vn.ifi;
 
 
 
 
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import vn.ifi.dao.OrderRepository;
import vn.ifi.entities.Orders;
 
 @EnableEurekaClient
@SpringBootApplication
public class ABourseOrderServiceApplication implements CommandLineRunner{
	@Autowired
	private OrderRepository orderRepository;
	public static void main(String[] args) {
		SpringApplication.run(ABourseOrderServiceApplication.class, args);
 
	}
 
	@Override
	public void run(String... args) throws Exception {
		java.sql.Date date1 = java.sql.Date.valueOf("2016-10-25");
		java.sql.Date date2 = java.sql.Date.valueOf("2016-10-26");
		java.sql.Date date3 = java.sql.Date.valueOf("2016-10-27");
 
		//OrderRepository orderRepository=ctx.getBean(OrderRepository.class);
		orderRepository.save(new Orders(date1,120,15));
		orderRepository.save(new Orders(date2,150,12));
		orderRepository.save(new Orders(date3,140,11));
		orderRepository.findAll().forEach(s->System.out.println(s.getId()+" "+s.getDate()+" "+s.getPrix()));
 
	}
}