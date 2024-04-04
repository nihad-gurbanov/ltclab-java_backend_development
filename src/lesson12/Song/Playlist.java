package lesson12.Song;

import java.util.Objects;

public class Playlist {
    private String name;
    private Song[] songs = new Song[3];

    public Playlist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Song[] getSongs() {
        return songs;
    }

    public void setSongs(Song[] songs) {
        this.songs = songs;
    }

    public void addSong(Song song) {
        boolean added = false;
        for (int i = 0; i < this.songs.length; i++) {
            if (this.songs[i] == null) {
                this.songs[i] = song;
                added = true;
                System.out.println(song.getArtist() + " " + song.getTitle() +" added to the " + this.name + " playlist!");
                break;
            }
        }
        if (!added) {
            System.out.println("This playlist is full!");
        }
    }

    public void displaySongs() {
        for( Song item : songs) {
            System.out.println(item.toString());
        }
    }
}
