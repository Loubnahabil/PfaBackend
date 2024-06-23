package com.pfa.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Chat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String chat_name;
	private String chat_image;
	
	@ManyToMany
	private List<User> users = new ArrayList<>();

	
	
	private LocalDateTime timestamp;
	

	@OneToMany(mappedBy="chat")
	private List<Message> messages= new ArrayList<>();
}
