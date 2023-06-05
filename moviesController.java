package com.onito.restapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onito.restapi.Repositories.moviesRepository;
import com.onito.restapi.Services.MoviesService;
import com.onito.restapi.entity.movies;
import com.onito.restapi.entity.topratedmovies;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@RestController
@RequestMapping("/api/v1")
public class moviesController {
    @PersistenceContext
	private EntityManager entityManager;

	@Autowired
	MoviesService movieService;
	
	@Autowired
	moviesRepository mr;
	
    @GetMapping("/longest-duration-movies")
    public List<movies> longestDurationMovies() {
        TypedQuery<movies> query = entityManager.createQuery(
            "SELECT m FROM movies m ORDER BY m.runtimeMinutes DESC", movies.class);
        query.setMaxResults(10);
        return query.getResultList();
    }
	
    @PostMapping("/new-movie")
    public String createNewMovie(@RequestBody movies movie) {
    	return movieService.createNewMovie(movie);
    }
    
    @GetMapping("/top-rated-movies")
    public List<topratedmovies> getTopRatedMovies(){
    	return movieService.getTopRatedMovies();
    }
    
	
	
	@GetMapping("/genre-movies-with-subtotals")
	public List<movies> GenreMoviesWithSubTotal(){
		return movieService.GenreMoviesWithSubTotal();
	}

//	@PutMapping("/update-runtime-minutes")
//	public void UpdateRuntimeMinutes() {
//	 movieService.updateRuntimeMinutes();
//	}

//	@PutMapping("/update-runtime-minutes")
//	 public ResponseEntity<String> UpdateRuntimeMinutes() {
//	        try {
//	            movieService.updateRuntimeMinutes();
//	            return ResponseEntity.ok("Runtime minutes updated successfully.");
//	        } catch (Exception e) {
//	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to update runtime minutes.");
//	        }
//	    }
	
	
//	@PutMapping("xx")
//	public void UpdateRuntimeMinutes1() {
//		mr.updateRuntimeMinutes();
//		}
//	
//	@GetMapping("xxx")
//	public void UpdateRuntimeMinutes11() {
//		mr.incrementColumn1ByCondition();
//		}
//	
	
	
}
