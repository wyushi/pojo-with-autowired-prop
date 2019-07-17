package com.spring.demo.creatingprototypebean.movie;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MovieProvider {
    
    @Autowired
    private MovieFactory movieFactory;
    
    public List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        Movie m = this.movieFactory.create("Infinity War");
        movies.add(m);
        Movie m2 = this.movieFactory.create("End Game");
        movies.add(m2);
        return movies;
    }
}