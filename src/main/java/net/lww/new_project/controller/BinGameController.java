package net.lww.new_project.controller;

import net.lww.new_project.NewProjectApplication;
import net.lww.new_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BinGameController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/binGame/")
    public String toBinGame() {
        return "binGame";
    }

    @ResponseBody
    @GetMapping(value = "/binGame/difficulty")
    public int getDifficulty(int id) {
        return userService.getUser(id).getDifficulty();
    }
}
