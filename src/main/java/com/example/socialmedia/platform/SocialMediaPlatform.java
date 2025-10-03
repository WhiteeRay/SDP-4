package com.example.socialmedia.platform;

import com.example.socialmedia.sender.MessageSender;
import java.util.Objects;

/**
 * Abstraction: high-level Social Media platform.
 */
public abstract class SocialMediaPlatform {
    protected final MessageSender sender;

    protected SocialMediaPlatform(MessageSender sender) {
        this.sender = Objects.requireNonNull(sender, "sender must not be null");
    }

    /**
     * Post content on this platform using the configured sender.
     */
    public abstract String post(String content);

    protected abstract String getPlatformName();
}
