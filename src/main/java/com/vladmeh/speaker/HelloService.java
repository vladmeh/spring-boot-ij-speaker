package com.vladmeh.speaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;


@Service
public class HelloService implements CommandLineRunner {

    private final HelloProperties properties;

    @Autowired
    public HelloService(HelloProperties properties) {
        this.properties = properties;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("======= " + properties.getPrefix() + " " + properties.getTarget());
    }
}
