package lesson20.Spotify;

public class Punk implements Music{
    String title;
    String artist;
    int duration;

    public Punk(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public void getDetails() {

    }

    @Override
    public String toString() {
        return "Punk{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }
}
