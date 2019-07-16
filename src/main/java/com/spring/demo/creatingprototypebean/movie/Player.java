package com.spring.demo.creatingprototypebean.movie;

import org.springframework.stereotype.Component;

@Component
public class Player {

    public void play(Movie movie) {
        System.out.println("Play movie " + movie.getName());
    }

}