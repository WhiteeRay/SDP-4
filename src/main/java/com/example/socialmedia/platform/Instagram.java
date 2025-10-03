package com.example.socialmedia.platform;

import com.example.socialmedia.sender.MessageSender;


public final class Instagram extends SocialMediaPlatform {

    public Instagram(MessageSender sender) {
        super(sender);
    }

    @Override
    public String post(String content) {
        if (!content.startsWith("#")) {
            return "Instagram posts should start with a hashtag!";
        }
        return sender.sendMessage(getPlatformName(), content);
    }

    @Override
    protected String getPlatformName() {
        return "Instagram";
    }
}
