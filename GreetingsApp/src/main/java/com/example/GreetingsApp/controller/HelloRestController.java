package com.example.greetingsapp.controller;

import com.example.greetingsapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    // UC 1: GET /hello
    @GetMapping
    public String hello() {
        return "Hello from BridgeLabz";
    }

    // UC 2: GET /hello/query?name=Mark
    @GetMapping("/query")
    public String helloQueryParam(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC 3: GET /hello/param/{name}
    @GetMapping("/param/{name}")
    public String helloPathParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC 4: POST /hello/post with JSON body
    @PostMapping("/post")
    public String helloPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    // UC 5: PUT /hello/put/{firstName}?lastName=Taylor
    @PutMapping("/put/{firstName}")
    public String helloPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
