package main;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
//import javax.swing.JOptionPane;
import models.Song;
import services.MusicLibrary;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MusicApp {

	private static Scanner keyboard = new Scanner(System.in);
	static int choiceInt = 0;

	public static void main(String[] args) {
		
		//Instatiation of a new song and a new entry in the music library instance
		Song song = new Song();
		MusicLibrary musicLibrary = new MusicLibrary();

		//ArrayList for the Top ten hits
		ArrayList <Song> topTen = new ArrayList<Song>();
		ArrayList <Song> playlist = new ArrayList<Song>();
		
		
		musicLibrary.topTenCharts(topTen);
		musicLibrary.defaultSongPlaylist(playlist);
		
		println("Welcome to the music playlist");

		while (choiceInt != 8) {
			try {
				println("Please Select from one of the following:");
				print("1. View all songs in your playlist" + "\n2. Search for a song" + "\n3. Search for a artist"
						+ "\n4. Add new song to your playlist" + "\n5. Remove a song from your playlist"
							+ "\n6. Play a song from your playlist" + "\n7. Top ten songs on the charts this week" + 
								"\n8. For a unexpected surprise." + "\n9. Exit" + "\nOption selected: ");
				choiceInt = keyboard.nextInt();

				switch (choiceInt) {
				case 1:
					musicLibrary.showPlaylist(playlist);
					break;
				case 2:
					musicLibrary.findSongByTitle(playlist);
					break;
				case 3:
					println("Testing case 3");
					break;
				case 4:
					musicLibrary.addSong(playlist);
					break;
				case 5:
					musicLibrary.removeSong(playlist);
					break;
				case 6:
					println("Testing case 6");
					break;
				case 7:
					musicLibrary.topTen(topTen);
					break;
				case 8:
					String filePath = "audio1.wav";
					playMemeMusic(filePath);
					break;
				case 9:
					println("Testing exit status");
					return;
				default:
					println("Please enter an integer");
				}
				
		} catch (InputMismatchException e) {
			println("Error: Please enter according to menu options");
			keyboard.nextLine();
		} catch (Exception e) {
			println("Error: Only integer values are to be entered by the user");
			keyboard.nextLine();
		}
	}
}

	public static void playMemeMusic(String location) {

		File musicPath = new File(location);
		try {
			if (musicPath.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				//
//				JOptionPane.showMessageDialog(null, "You just got Rick Rolled. \nPress 'Stop' to stop playing the song'.");
				clip.open(audioInput);
				clip.start();
			
				clip.stop();
				clip.close();
			}
		}

		catch (Exception e) {
			println("Error: Music file or name is not found.");
		}
	}

	public static void print(String message) {
		System.out.print(message);
	}

	public static void println(String message) {
		System.out.println(message);
	}
}
