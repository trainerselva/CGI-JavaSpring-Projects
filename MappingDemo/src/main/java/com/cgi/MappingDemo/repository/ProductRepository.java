package com.cgi.MappingDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.MappingDemo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
