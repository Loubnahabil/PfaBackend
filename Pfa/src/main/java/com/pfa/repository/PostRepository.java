package com.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.models.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
	
	

}
