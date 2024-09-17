package com.cgi.MappingDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.MappingDemo.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
