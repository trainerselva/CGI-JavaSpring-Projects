package com.cgi.MappingDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.MappingDemo.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
