package vn.ifi.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import vn.ifi.entities.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long>{

}
