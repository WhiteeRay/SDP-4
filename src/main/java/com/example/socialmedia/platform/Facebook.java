package com.example.socialmedia.platform;

import com.example.socialmedia.sender.MessageSender;


public final class Facebook extends SocialMediaPlatform {

    public Facebook(MessageSender sender) {
        super(sender);
    }

    @Override
    public String post(String content) {
        return sender.sendMessage(getPlatformName(), content);
    }

    @Override
    protected String getPlatformName() {
        return "Facebook";
    }
}
