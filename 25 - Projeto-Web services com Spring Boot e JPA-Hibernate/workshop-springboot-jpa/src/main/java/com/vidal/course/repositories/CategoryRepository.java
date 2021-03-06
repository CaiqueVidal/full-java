package com.vidal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vidal.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
