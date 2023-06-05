package com.onito.restapi.Services;

import java.util.List;

import com.onito.restapi.entity.movies;
import com.onito.restapi.entity.topratedmovies;

public interface MoviesService {


	String createNewMovie(movies movie);

	public List<topratedmovies> getTopRatedMovies();

	public List<movies> GenreMoviesWithSubTotal();

//	public void updateRuntimeMinutes();


}
