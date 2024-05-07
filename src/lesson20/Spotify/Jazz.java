package lesson20.Spotify;

public class Jazz implements Music{
    String title;
    String artist;
    int duration;

    @Override
    public String toString() {
        return "Jazz{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }

    public Jazz(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public void getDetails() {

    }
}
