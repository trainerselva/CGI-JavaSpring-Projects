package com.cgi.springCoreDemo.service;

import java.util.List;

public class MovieLibrary {

	private List<String> movies;

	// Setter method for dependency injection
	public void setMovies(List<String> movies) {
		this.movies = movies;
	}
	
	public void displayMovies() {
		System.out.println("Movies in the library:");
		movies.stream().forEach(System.out::println);
	}
}
