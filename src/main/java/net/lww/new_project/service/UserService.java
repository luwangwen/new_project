package net.lww.new_project.service;

import net.lww.new_project.entity.impl.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class UserService {

    public static List<net.lww.new_project.entity.User> userList = new ArrayList<>();
    @Autowired
    private User user;

    public net.lww.new_project.entity.User newUser(int id) {
        user.setId(id);
        return user;
    }

    public net.lww.new_project.entity.User getUser(int id) {
        for (net.lww.new_project.entity.User user :
                userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
