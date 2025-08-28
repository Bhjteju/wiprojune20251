package com.wipro.productapp2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.productapp2.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {

}
