package services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import models.Song;


public class MusicLibrary {

	private static int choiceInt;
	private static String choiceString;
	private Scanner keyboard = new Scanner(System.in);

	ArrayList<Song> topTen = new ArrayList<Song>();
	ArrayList<Song> playlist = new ArrayList<Song>();

	public void topTenCharts(ArrayList<Song> topTen) {
		topTen.add(new Song("Ordinary", "Alex Warren", "Pop", "Single", "3:07", 2025));
		topTen.add(new Song("Anxiety", "Doeschii", "Pop", "Single", "4:09", 2025));
		topTen.add(new Song("BIRDS OF A FEATHER", "Billie Eilish", "Pop", "HIT ME HARD AND SOFT", "3:30", 2024));
		topTen.add(new Song("Die With A Smile", "Lady Gaga, Bruno Mars", "Pop", "Single", "4:12", 2024));
		topTen.add(new Song("luther", "Kendrick Lamar, SZA", "Rap/Pop", "GNX", "2:57", 2024));
		topTen.add(new Song("Pink Pony Club", "Chappell Roan", "Pop", "The Rise and Fall of a Midwest Princess",
				"4:18", 2023));
		topTen.add(new Song("APT", "ROSÉ, Bruno Mars", "Pop", "Single", "2:49", 2024));
		topTen.add(new Song("Abracadabra", "Lady Gaga", "Dance", "Mayhem", "3:43", 2025));
		topTen.add(new Song("Taste", "Sabrina Carpenter", "Pop", "Short & Sweet", "2:37", 2024));
		topTen.add(new Song("Cry For Me", "The Weeknd", "Pop", "Hurry Up Tomorrow", "3:44", 2025));
	}

	public void defaultSongPlaylist(ArrayList<Song> playlist) {
		playlist.add(new Song("Blue Monday", "New Order", "1980's", "Substance", "7:00", 1983));
		playlist.add(new Song("Self Control", "Lauren Branigan", "1980's", "Album", "3:50", 1980));
	}

	public void showPlaylist(ArrayList<Song> playlist) {
		Iterator<Song> iterator = playlist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public void addSong(ArrayList<Song> playlist) {
		System.out.println("Song Title: ");
		if (keyboard.hasNext()) {
			String title = keyboard.next();
			System.out.println("Artist: ");
			String artist = keyboard.next();
			System.out.println("Genre: ");
			String genre = keyboard.next();
			System.out.println("Album: ");
			String album = keyboard.next();
			System.out.println("Length of Song: ");
			String duration = keyboard.next();
			System.out.println("Year of Release of Song: ");
			String yearOfRelease = keyboard.next();
			String totalInformation = title + artist + genre + album + duration + yearOfRelease;
			System.out.println(totalInformation);
			//Add all the information to the arraylist
//			playlist.add(totalInformation);
		}
	}

	public void removeSong(ArrayList<Song> playlist) {
		System.out.print("Please enter the song you would like to remove: ");
		playlist.remove(choiceInt);
	}

	public void findSongByTitle(ArrayList<Song> playlist) {
		String songSearch;
		System.out.print("What song would you like to look for: ");
		if (keyboard.hasNext()) {
			choiceString = keyboard.next();
			songSearch = choiceString;
			for (Song song : playlist) {
				String happy = song.getTitle();
				if (songSearch.equalsIgnoreCase(happy)) {
					if (happy.equals(songSearch)) {
						System.out.println(happy);
					}
				}
			}
			
			if (playlist.isEmpty()) {
				System.out.println("Your playlist is empty");
			}
		}

	}

	public void playSong() {

	}

	public void topTen(ArrayList<Song> topTen) {
		if (topTen.isEmpty()) {
			System.out.println("No songs have been added to your playlist.");
		} else {
			System.out.println("Here are the top ten songs in the charts right now");
			for (int i = 0; i < topTen.size(); i++) {
				System.out.print("\n" + (i + 1) + ". Song: " + topTen.get(i).getTitle());
				System.out.print("\tArtist: " + topTen.get(i).getArtist());
				System.out.println("\t Album: " + topTen.get(i).getAlbum() + "\n");
			}
		}
	}
}
