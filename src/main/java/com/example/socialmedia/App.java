package com.example.socialmedia;

import com.example.socialmedia.platform.*;
import com.example.socialmedia.sender.ApiSender;
import com.example.socialmedia.sender.EmailSender;
import com.example.socialmedia.sender.SmsSender;

public final class App {
    public static void main(String[] args) {
        var apiSender = new ApiSender();
        var emailSender = new EmailSender();
        var smsSender = new SmsSender();

        var facebook = new Facebook(apiSender);
        var twitter = new Twitter(emailSender);
        var instagram = new Instagram(smsSender);

        System.out.println(facebook.post("Hello, Facebook friends!"));
        System.out.println(twitter.post("Bridge pattern makes code flexible!"));
        System.out.println(twitter.post("This tweet is way too long ".repeat(20)));
        System.out.println(instagram.post("#TravelVibes"));
        System.out.println(instagram.post("Missing hashtag example"));
    }
}
