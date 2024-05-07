package lesson20.Spotify;

public class Podcast implements Playable{
    String title;
    int duration;


    public Podcast(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public void getDetails() {

    }

    @Override
    public String toString() {
        return "Podcast{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
