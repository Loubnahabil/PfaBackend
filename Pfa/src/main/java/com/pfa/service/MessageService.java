package com.pfa.service;

import java.util.List;

import com.pfa.models.Chat;
import com.pfa.models.Message;
import com.pfa.models.User;

public interface MessageService {
	
	public Message createMessage(User user,Integer chatId, Message req) throws Exception;
	
	public List<Message> findChatsMessages(Integer chatId) throws Exception;
	

}
