package com.example.socialmedia.sender;

/**
 * Concrete Implementor: simulates sending by Email.
 */
public final class EmailSender implements MessageSender {
    @Override
    public String sendMessage(String platformName, String content) {
        return String.format("Email -> Delivered to %s inbox: \"%s\"", platformName, content);
    }
}
