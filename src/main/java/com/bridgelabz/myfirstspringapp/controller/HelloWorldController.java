package com.bridgelabz.myfirstspringapp.controller;

import com.bridgelabz.myfirstspringapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping(value = {"/", "", "/home"})
    public String sayHello() {
        return "Hello World";
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String sayHelloForQueryParameter(@RequestParam(value = "name") String name) {
        return "Hello " + name;
    }

    @GetMapping("/param/{name}")
    public String sayHelloForPathVariable(@PathVariable String name) {
        return "Hello " + name;
    }

    @PostMapping("/post")
    public String sayHelloForRequestBody(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName();
    }
}
