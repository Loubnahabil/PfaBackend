package com.pfa.service;

import java.util.List;

import com.pfa.models.Chat;
import com.pfa.models.Message;

public interface MessageService {
	
	public Message createMessage(Integer userId,Integer chatId, Chat chat);
	
	public List<Message> findChatsMessages(Integer chatId);
	

}
