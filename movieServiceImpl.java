package com.onito.restapi.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onito.restapi.Repositories.moviesRepository;
import com.onito.restapi.Repositories.ratingsRepository;
import com.onito.restapi.Services.MoviesService;
import com.onito.restapi.entity.movies;
import com.onito.restapi.entity.ratings;
import com.onito.restapi.entity.topratedmovies;

@Service
public class movieServiceImpl implements MoviesService {

	@Autowired
	moviesRepository moviesrepository;
	
	@Autowired
	ratingsRepository ratingsrepository;
	
	@Override
	public String createNewMovie(movies movie) {
		moviesrepository.save(movie);
		return "success";
	}

	@Override
	public List<topratedmovies> getTopRatedMovies() {
        List<ratings> topRatings = ratingsrepository.findByAverageRatingGreaterThan(6.0);
        List<topratedmovies> topmovies =new ArrayList<>();
        for(ratings rating: topRatings) {
        	movies movie=moviesrepository.findById(rating.getTconst()).get();
        	topmovies.add(new topratedmovies(movie.getTconst(), movie.getPrimaryTitle(), movie.getGenres(), rating.getAverageRating()));
        }
        
		return topmovies;
	}

	@Override
	public List<movies> GenreMoviesWithSubTotal() {

		return moviesrepository.getgenrewise();
	}

}
