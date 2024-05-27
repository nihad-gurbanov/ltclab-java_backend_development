package lesson20.Spotify;

import java.util.LinkedList;
import java.util.List;

public class Playlist<T extends Playable>{
    List<T> playing = new LinkedList<>();

    void addToList(T playable) {
        playing.add(playable);
    }
    void printDetails() {
        System.out.println(playing);
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playing=" + playing +
                '}';
    }
}
