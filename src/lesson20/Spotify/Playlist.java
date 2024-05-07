package lesson20.Spotify;

import java.util.LinkedList;
import java.util.List;

public class Playlist<T extends Playable>{
    List<Playable> playing = new LinkedList<>();

    void addToList(T playable) {
        playing.add(playable);
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playing=" + playing +
                '}';
    }
}
