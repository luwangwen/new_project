package net.lww.new_project.controller;

import net.lww.new_project.NewProjectApplication;
import net.lww.new_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/myIndex")
    public String index() {
        NewProjectApplication.LOGGER.info("hello");
        return "index";
    }

    @ResponseBody
    @PostMapping(value = "/myIndex/new")
    public void newUser(int id) {
        UserService.userList.add(userService.newUser(id));
    }
}
