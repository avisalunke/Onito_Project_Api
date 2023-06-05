package com.onito.restapi.entity;

public class topratedmovies {

	String tconst;
	String primaryTitle;
	String genres;
	double averageRating;
	
	
	public String getTconst() {
		return tconst;
	}
	public void setTconst(String tconst) {
		this.tconst = tconst;
	}
	public String getPrimaryTitle() {
		return primaryTitle;
	}
	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	public double getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}
	public topratedmovies(String tconst, String primaryTitle, String genres, double averageRating) {
		super();
		this.tconst = tconst;
		this.primaryTitle = primaryTitle;
		this.genres = genres;
		this.averageRating = averageRating;
	}
	@Override
	public String toString() {
		return "topratedmovies [tconst=" + tconst + ", primaryTitle=" + primaryTitle + ", genres=" + genres
				+ ", averageRating=" + averageRating + "]";
	}
	
	}
