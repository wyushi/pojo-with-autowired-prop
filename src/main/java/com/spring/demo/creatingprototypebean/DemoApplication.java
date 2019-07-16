package com.spring.demo.creatingprototypebean;

import java.util.List;

import javax.annotation.PostConstruct;

import com.spring.demo.creatingprototypebean.movie.Movie;
import com.spring.demo.creatingprototypebean.movie.MovieProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private MovieProvider provider;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}

	@PostConstruct
	public void run() {
		List<Movie> movies = this.provider.getMovies();
		for (Movie m : movies) {
			m.play();
		}
	}
}
