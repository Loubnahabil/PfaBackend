package com.pfa.service;

import java.util.List;

import com.pfa.models.Post;

public interface PostService {

	Post createNewPost(Post post, Integer userId)throws Exception;
	
	String deletePost(Integer postId,Integer UserId);
	
	List<Post> FindPostByUserId(Integer userId);
	
	Post findPostById(Integer postId);
	
	List<Post> findAllPost();
	
	Post savedPost(Integer postId, Integer userId);
	
	Post likePost(Integer postId,Integer userId);
	
}
