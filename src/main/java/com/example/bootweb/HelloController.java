package com.example.bootweb;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Hello from Spring";
    }

    @RequestMapping("/new")
	public String newthing() {
		return "Here's a new thing";
	}

}


