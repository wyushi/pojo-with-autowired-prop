package com.spring.demo.creatingprototypebean.movie;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

    @Autowired
    private Player player;

    private final String name;

    public static Movie create(String name) {
        return new Movie(name);
    }
    
    int id;
    String title;

    private Movie(String name) {
        this.name = name;
    }

    public void play() {
        this.player.play(this);
    }

    public String getName() {
        return this.name;
    }
}