package net.lww.new_project.controller;

import net.lww.new_project.NewProjectApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/myIndex")
    public String index() {
        NewProjectApplication.LOGGER.info("hello");
        return "index";
    }

    @RequestMapping("/binGame.html")
    public String toBinGame() {
        return "binGame";
    }
}
