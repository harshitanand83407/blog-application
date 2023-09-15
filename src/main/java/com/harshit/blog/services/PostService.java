package com.harshit.blog.services;

import java.util.List;

import com.harshit.blog.entities.Post;
import com.harshit.blog.payloads.PostDto;
import com.harshit.blog.payloads.PostResponse;

public interface PostService {
//create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
//update
	PostDto updatePost(PostDto postDto,Integer postId);
//delete
	void deletePost(Integer postId);
//get all posts
	PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);
//get single post
	PostDto getPostById(Integer postId);
//get all post by category
	List<PostDto> getPostByCateogory(Integer categoryId);
//get all post by user
	List<PostDto> getPostByUser(Integer userId);
//search posts
	List<PostDto> searchPosts(String keyword);
    
}
