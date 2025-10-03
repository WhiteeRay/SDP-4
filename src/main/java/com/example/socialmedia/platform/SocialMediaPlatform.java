package com.example.socialmedia.platform;

import com.example.socialmedia.sender.MessageSender;
import java.util.Objects;


public abstract class SocialMediaPlatform {
    protected final MessageSender sender;

    protected SocialMediaPlatform(MessageSender sender) {
        this.sender = Objects.requireNonNull(sender, "sender must not be null");
    }

    public abstract String post(String content);

    protected abstract String getPlatformName();
}
