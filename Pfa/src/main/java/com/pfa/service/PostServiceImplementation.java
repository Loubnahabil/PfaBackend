package com.pfa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.models.Post;
import com.pfa.repository.PostRepository;
@Service
public class PostServiceImplementation implements PostService {

	@Autowired
	PostRepository postRepository;
	@Override
	public Post createNewPost(Post post, Integer userId) throws Exception {
		
		Post newPost = new Post();
		return null;
	}

	@Override
	public String deletePost(Integer postId, Integer UserId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> FindPostByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post findPostById(Integer postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> findAllPost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post savedPost(Integer postId, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post likePost(Integer postId, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
