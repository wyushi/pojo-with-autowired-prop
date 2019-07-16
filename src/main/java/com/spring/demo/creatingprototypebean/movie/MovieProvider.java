package com.spring.demo.creatingprototypebean.movie;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;


@Service
public class MovieProvider {
    
    @Autowired
    private ApplicationContext appCtx;
    
    public List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        Movie m = this.appCtx.getBean(Movie.class, "Infinity War");
        movies.add(m);
        Movie m2 = this.appCtx.getBean(Movie.class, "End Game");
        movies.add(m2);
        return movies;
    }
}