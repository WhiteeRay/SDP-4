package com.example.socialmedia.sender;


public final class SmsSender implements MessageSender {
    @Override
    public String sendMessage(String platformName, String content) {
        return String.format("SMS -> Sent to %s followers: \"%s\"", platformName, content);
    }
}
