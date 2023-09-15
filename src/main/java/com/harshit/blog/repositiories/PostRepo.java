package com.harshit.blog.repositiories;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.harshit.blog.entities.Category;
import com.harshit.blog.entities.Post;
import com.harshit.blog.entities.User;

public interface PostRepo extends JpaRepository<Post ,Integer> {

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category cateogory);
	List<Post> findByTitleContaining(String title);
	
	
	
	
	
}
