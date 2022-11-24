package com.albumteca.albumtecaApi.controllers;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {

	@GetMapping("/")
    public String loadFront(Map<String, Object> model) {
        return "index.html";
    }
}
