package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ORManagerController {
	
    @RequestMapping(value = "/test")
    @ResponseBody
    public String index() {
        return "Greetings from Spring Boot!";
    }
}