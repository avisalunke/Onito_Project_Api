package com.onito.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ratings {

	@Id
	@Column(name = "tconst")
	private String tconst;
	
	@Column(name = "averageRating")
	private double averageRating;
	
	@Column(name = "numVotes")
	private int numVotes;
	
	@OneToOne
	movies movie;

	public String getTconst() {
		return tconst;
	}

	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	public double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}

	public int getNumVotes() {
		return numVotes;
	}

	public void setNumVotes(int numVotes) {
		this.numVotes = numVotes;
	}

	public ratings(String tconst, double averageRating, int numVotes) {
		super();
		this.tconst = tconst;
		this.averageRating = averageRating;
		this.numVotes = numVotes;
	}

	public ratings() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ratings [tconst=" + tconst + ", averageRating=" + averageRating + ", numVotes=" + numVotes + "]";
	}



}
