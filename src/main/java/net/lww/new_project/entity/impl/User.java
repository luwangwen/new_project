package net.lww.new_project.entity.impl;

import org.springframework.context.annotation.Configuration;

@Configuration()
public class User implements net.lww.new_project.entity.User {

    private int difficulty = 1;

    private int id;

    @Override
    public int getDifficulty() {
        return difficulty;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void difficultyPlus() {
        difficulty++;
    }
}
