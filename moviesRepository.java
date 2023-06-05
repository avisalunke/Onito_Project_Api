package com.onito.restapi.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.onito.restapi.entity.movies;


public interface moviesRepository extends JpaRepository<movies, String> {
	
//	@Query("SELECT * FROM onito.movies order by runtimeMinutes desc limit 1,10")
//	List<movies> findTopMoviesByRuntime();
//	
//	List<movies> findFirst10ByruntimeMinutes(int  runtimeMinutes, Sort sort);}

//	@Query("FROM Author WHERE firstName = ?1 ORDER BY lastName ASC")
//    List<Author> findByFirstNameOrderByLastname(String firstName);
//	
	
    List<movies> findByTitleTypeAndGenresContaining(String titletype, String genre);

    
	 @Query(value = "SELECT e from movies e order by e.runtimeMinutes desc")
	    List<movies> findmoviesByDesc();
	    
	    @Query(value = "SELECT m FROM movies m ORDER BY m.genres")
	    List<movies> getgenrewise();

	    
//	    @Query("UPDATE movies m SET m.runtimeMinutes = m.runtimeMinutes + CASE m.genres " +
//	            "WHEN 'Documentary' THEN 15 " +
//	            "WHEN 'Animation' THEN 30 " +
//	            "ELSE 45 " +
//	            "END")
//	    void incrementRuntimeMinutesByGenre();
//	    
	    
//	    @Modifying
//	    @Query("update movies m set m.runtimeMinutes = m.runtimeMinutes + 15 where m.genres = 'Documentary' ")
//	    void incrementRuntimeMinutesByGenre1();
//	    
//	    @Modifying
//	    @Query("UPDATE movies e SET e.runtimeMinutes = e.runtimeMinutes + 15 WHERE e.genres = :condition ")
//	    void incrementColumn1ByCondition(@Param("condition") String condition);

	    
//	    @Modifying
//	    @Query(value = "UPDATE movies " +
//	                   "SET runtimeMinutes = CASE " +
//	                   "  WHEN genres = 'Documentary' THEN runtimeMinutes + 15 " +
//	                   "  WHEN genres = 'Animation' THEN runtimeMinutes + 30 " +
//	                   "  ELSE runtimeMinutes + 45 " +
//	                   "END", nativeQuery = true)
//	    void updateRuntimeMinutes();
//	    
}