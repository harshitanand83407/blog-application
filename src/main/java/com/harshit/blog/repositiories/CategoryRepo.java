package com.harshit.blog.repositiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harshit.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category ,Integer> {

}
