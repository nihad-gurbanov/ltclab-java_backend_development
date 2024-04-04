package lesson12.Song;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Song s1 = new Song("Michael Jackson", "Smooth Criminal", 565);
        Song s2 = new Song("Michael Jackson", "Billie Jean", 297);
        Song s3 = new Song("Michael Jackson", "Beat it", 258);
        Song s4 = new Song("Michael Jackson", "Artist", 357); // full

        Playlist michael = new Playlist("Michael Jackson");
        System.out.println("\nAdding songs...");
        michael.addSong(s1);
        michael.addSong(s2);
        michael.addSong(s3);

        System.out.println("\nTrying to add to the full michael...");
        michael.addSong(s4);

        System.out.println("\nDisplaying songs...");
        michael.displaySongs();

    }
}
