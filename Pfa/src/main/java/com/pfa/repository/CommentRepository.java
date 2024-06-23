package com.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.pfa.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>{

	
	
}
