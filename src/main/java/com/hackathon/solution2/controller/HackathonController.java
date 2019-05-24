package com.hackathon.solution2.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HackathonController {

    @PostMapping(path="/log")
    public void log(@RequestBody Message message) {
        System.out.println(String.format("Received: '%s'", message.message));
    }
}
