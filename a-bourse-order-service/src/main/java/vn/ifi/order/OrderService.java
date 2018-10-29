package vn.ifi.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import vn.ifi.dao.OrderRepository;
import vn.ifi.entities.Orders;
@RestController
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	@RequestMapping(value="consulterOrders",method=RequestMethod.GET)
	public List<Orders> listOrder(){
		return orderRepository.findAll();
		
	}

}
