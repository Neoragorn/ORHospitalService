package application.launcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ORManagerController {
	
    @RequestMapping(value = "/home")
    public String home() {
    	
        return "home";
    }
}
