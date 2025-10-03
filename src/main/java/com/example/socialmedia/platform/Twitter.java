package com.example.socialmedia.platform;

import com.example.socialmedia.sender.MessageSender;

/**
 * Refined Abstraction: Twitter (X) platform.
 */
public final class Twitter extends SocialMediaPlatform {

    public Twitter(MessageSender sender) {
        super(sender);
    }

    @Override
    public String post(String content) {
        if (content.length() > 280) {
            return "Error: Tweet too long!";
        }
        return sender.sendMessage(getPlatformName(), content);
    }

    @Override
    protected String getPlatformName() {
        return "Twitter";
    }
}
