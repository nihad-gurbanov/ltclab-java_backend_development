package lesson20.Spotify;

public class Rock implements Music{
    String title;
    String artist;
    int duration;

    @Override
    public String toString() {
        return "Rock{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }

    public Rock(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public void getDetails() {
        System.out.println("Title: " + title + "\nArtist: " + artist + "\nDuration: " + duration );
    }
}
