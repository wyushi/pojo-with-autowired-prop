package com.spring.demo.creatingprototypebean;

import com.spring.demo.creatingprototypebean.movie.Movie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    @Scope("prototype")
    public Movie movie(String name) {
        return Movie.create(name);
    }
}