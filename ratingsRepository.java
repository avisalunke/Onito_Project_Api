package com.onito.restapi.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onito.restapi.entity.ratings;

public interface ratingsRepository extends JpaRepository<ratings, String>{
    List<ratings> findByAverageRatingGreaterThan(Double averageRating);

}
