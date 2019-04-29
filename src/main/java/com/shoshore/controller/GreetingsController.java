package com.shoshore.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingsController {


    @GetMapping("/greeting")
    public ResponseEntity<String> greetings(
            @RequestParam("name")String name,
            @RequestParam("gender")String gender
    ){
        return new ResponseEntity<String>(
                String.format("Hello Mr . %s. How are you?", name),
                HttpStatus.OK

        );
    }
}
