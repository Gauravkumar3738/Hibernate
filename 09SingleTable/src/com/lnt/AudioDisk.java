package com.lnt;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="ad")
public class AudioDisk extends Disk{
	private String albumName;
	
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getAlbumName() {
		return albumName;
	}
	public AudioDisk() {
		// TODO Auto-generated constructor stub
	}
	public AudioDisk(int diskId, String description,String albumName) {
		super(diskId, description);
		this.albumName=albumName;
	}	
	
	
	
}