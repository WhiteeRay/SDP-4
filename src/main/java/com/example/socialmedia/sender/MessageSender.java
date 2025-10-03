package com.example.socialmedia.sender;

/**
 * Implementor in Bridge pattern.
 * Defines a way to send messages.
 */
public interface MessageSender {
    String sendMessage(String platformName, String content);
}
