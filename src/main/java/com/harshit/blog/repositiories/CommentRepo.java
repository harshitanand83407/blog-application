package com.harshit.blog.repositiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harshit.blog.entities.Comment;

public interface CommentRepo extends JpaRepository <Comment,Integer> {

}
