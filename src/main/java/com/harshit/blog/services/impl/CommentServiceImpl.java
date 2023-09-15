package com.harshit.blog.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harshit.blog.entities.Comment;
import com.harshit.blog.entities.Post;
import com.harshit.blog.exceptions.ResourceNotFoundException;
import com.harshit.blog.payloads.CommentDto;
import com.harshit.blog.repositiories.CommentRepo;
import com.harshit.blog.repositiories.PostRepo;
import com.harshit.blog.services.CommentService;
@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
    private PostRepo postRepo;
	@Autowired
    private CommentRepo commentRepo;
	@Autowired
	private ModelMapper modelMapper;
	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {
		Post post=this.postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post","post id",postId));
		Comment comment = this.modelMapper.map(commentDto,Comment.class);
		comment.setPost(post);
		Comment savedComment=this.commentRepo.save(comment);
		return this.modelMapper.map(savedComment,CommentDto.class);
		
		
	}

	@Override
	public void deleteComment(Integer commentId) {
		Comment com=this.commentRepo.findById(commentId).orElseThrow(()-> new ResourceNotFoundException("Comment","Comment id", commentId));
		this.commentRepo.delete(com);

	}

}
