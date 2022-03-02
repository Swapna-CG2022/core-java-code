package com.cg.oopsinjava.gettersandsettersexample;

public class MP3 extends Product{
	
	private String artistName;
	private float duration;
	
	public MP3() {
		// TODO Auto-generated constructor stub
	}
	
	

	public MP3(String artistName, float duration) {
		super();
		this.artistName = artistName;
		this.duration = duration;
	}



	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}
	
	

}
