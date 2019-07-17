package com.spring.demo.creatingprototypebean.movie;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {

    private Player player;
    private final String name;
    
    public Movie(String name) {
        this.name = name;
    }

    public void play() {
        this.player.play(this);
    }
}