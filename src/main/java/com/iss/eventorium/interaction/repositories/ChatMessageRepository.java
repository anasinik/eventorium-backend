package com.iss.eventorium.interaction.repositories;

import com.iss.eventorium.interaction.models.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
    List<ChatMessage> findByChatName(String chatName);
}
