package com.lnt;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="vd")
public class VideoDisk extends Disk{
	private String movieName;
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieName() {
		return movieName;
	}
	public VideoDisk() {
	}
	public VideoDisk(int diskId, String description,String movieName) {
		super(diskId, description);
		this.movieName=movieName;
	}
	
}
