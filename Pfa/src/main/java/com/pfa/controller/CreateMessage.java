package com.pfa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.models.Message;
import com.pfa.models.User;
import com.pfa.service.MessageService;
import com.pfa.service.UserService;

@RestController
public class CreateMessage {
	
	@Autowired
	private MessageService messageService;
	@Autowired

	private UserService userService;
	
	public Message createMessage(@RequestBody Message req, @RequestHeader("Authorization") String jwt,
			@PathVariable Integer chatId) throws Exception {
		
		User user=userService.findUserByJwt(jwt);
		Message message=messageService.createMessage(user, chatId, req);
		return message;
	}
	
	
	@GetMapping("/api/messages/chat/{chatId")
	public List<Message> findChatsMessage(@RequestHeader("Authorization") String jwt,
			@PathVariable Integer chatId) throws Exception {
		
		
		User user=userService.findUserByJwt(jwt);
		List<Message> messages=messageService.findChatsMessages(chatId);
		
		return messages;
	}
}
