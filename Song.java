package models;

public class Song {

	private String title, artist, genre, album, duration;
	private int yearOfRelease;

	public Song() {

	}
	
	public Song(String title, String artist, String genre, String album, String duration, int yearOfRelease) {
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.album = album;
		this.duration = duration;
		this.yearOfRelease = yearOfRelease;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public String toString() {
		return ("Title: " + getTitle() + " Artist: " + getArtist() + " Genre: " + getGenre() + " "
				+ "Album: " + getAlbum() + " Duration: " + getDuration() + " Year of Release: " + getYearOfRelease());
	}
}