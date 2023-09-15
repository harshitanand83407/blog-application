package com.harshit.blog.services;

import com.harshit.blog.payloads.CommentDto;

public interface CommentService {
	CommentDto createComment(CommentDto commentDto,Integer postId);
	void deleteComment(Integer commentId);

}
