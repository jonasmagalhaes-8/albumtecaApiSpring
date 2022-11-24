package com.albumteca.albumtecaApi.controllers;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/front")
public class FrontController {

	@GetMapping("/")
    public String loadFront(Map<String, Object> model) {
        return "index.html";
    }
}
