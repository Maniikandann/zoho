package combinedassignment10;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }


    public String toString() {
        return title + " by " + artist;
    }
}

public class MusicPlayer {
    private LinkedList<Song> playlist;
    private ListIterator<Song> currentSongIterator;
    private Song currentSong;

    public MusicPlayer() {
        playlist = new LinkedList<>();
        currentSongIterator = playlist.listIterator();
        currentSong = null;
    }

    public void addSong(Song song) {
        if (currentSongIterator.hasNext()) {
            currentSongIterator.next();
        }
        currentSongIterator.add(song);
        if (currentSong == null) {
            currentSong = song;
        }
    }

    public void removeSong(Song song) {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty.");
            return;
        }

        if (playlist.contains(song)) {
            playlist.remove(song);
            System.out.println(song + " has been removed from the playlist.");
        } else {
            System.out.println("Song not found in the playlist.");
        }

   
        currentSongIterator = playlist.listIterator();
        if (currentSongIterator.hasNext()) {
            currentSong = currentSongIterator.next();
        } else {
            currentSong = null;
        }
    }

    public void playNext() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty.");
            return;
        }
        if (currentSongIterator.hasNext()) {
            currentSong = currentSongIterator.next();
            System.out.println("Now playing: " + currentSong);
        } else {
            System.out.println("You have reached the end of the playlist.");
        }
    }

    public void playPrevious() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty.");
            return;
        }
        if (currentSongIterator.hasPrevious()) {
            currentSong = currentSongIterator.previous();
            System.out.println("Now playing: " + currentSong);
        } else {
            System.out.println("You are at the beginning of the playlist.");
        }
    }

    public void showPlaylist() {
        System.out.println("Current Playlist:");
        for (Song song : playlist) {
            System.out.println(song);
        }
    }

    public static void main(String[] args) {
        MusicPlayer playlist = new MusicPlayer();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMusic Player Playlist Menu:");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Play Next");
            System.out.println("4. Play Previous");
            System.out.println("5. Show Playlist");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter song artist: ");
                    String artist = scanner.nextLine();
                    playlist.addSong(new Song(title, artist));
                    break;
                case 2:
                    System.out.print("Enter song title to remove: ");
                    title = scanner.nextLine();
                    System.out.print("Enter song artist to remove: ");
                    artist = scanner.nextLine();
                    playlist.removeSong(new Song(title, artist));
                    break;
                case 3:
                    playlist.playNext();
                    break;
                case 4:
                    playlist.playPrevious();
                    break;
                case 5:
                    playlist.showPlaylist();
                    break;
                case 6:
                    scanner.close();
                    System.out.println("Exiting Music Player Playlist.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

