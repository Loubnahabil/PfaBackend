package com.pfa.service;

import java.util.List;

import com.pfa.models.Chat;
import com.pfa.models.User;

public interface ChatService {

	
	public Chat createChat(User reqUser, User user2);
	
	public Chat findChatById(Integer chatId) throws Exception;
	
	public List<Chat> findUsersChat(Integer userId);
}
