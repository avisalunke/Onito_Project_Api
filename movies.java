package com.onito.restapi.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="movies" )
public class movies {
	
	@Id
	@Column(name = "tconst")
	private String tconst;
	
	@Column(name = "titletype")
	private String titleType;
	
	@Column(name = "primarytitle")
	private String primaryTitle;
	
	@Column(name = "runtimeminutes")
	private int runtimeMinutes;

	@Column(name = "genres")
	private String genres;
	
//	@OneToOne(mappedBy = "movie" ,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//	ratings rating=new ratings();
//	

	public String getTconst() {
		return tconst;
	}

	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	public String getTitleType() {
		return titleType;
	}

	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}

	public String getPrimaryTitle() {
		return primaryTitle;
	}

	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}

	public int getRuntimeMinutes() {
		return runtimeMinutes;
	}

	public void setRuntimeMinutes(int runtimeMinutes) {
		this.runtimeMinutes = runtimeMinutes;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	public movies(String tconst, String titleType, String primaryTitle, int runtimeMinutes, String genres) {
		super();
		this.tconst = tconst;
		this.titleType = titleType;
		this.primaryTitle = primaryTitle;
		this.runtimeMinutes = runtimeMinutes;
		this.genres = genres;
	}

	public movies() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "movies [tconst=" + tconst + ", titleType=" + titleType + ", primaryTitle=" + primaryTitle
				+ ", runtimeMinutes=" + runtimeMinutes + ", genres=" + genres + "]";
	}
	
	
	
	
}
