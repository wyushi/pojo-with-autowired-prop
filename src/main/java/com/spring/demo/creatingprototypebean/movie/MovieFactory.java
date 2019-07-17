package com.spring.demo.creatingprototypebean.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieFactory {

    @Autowired
    private Player player;

    public Movie create(String name) {
        Movie m = new Movie(name);
        m.setPlayer(this.player);
        return m;
    }
}