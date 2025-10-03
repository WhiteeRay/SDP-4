package com.example.socialmedia.sender;


public final class ApiSender implements MessageSender {
    @Override
    public String sendMessage(String platformName, String content) {
        return String.format("API request -> Posting to %s: \"%s\"", platformName, content);
    }
}
