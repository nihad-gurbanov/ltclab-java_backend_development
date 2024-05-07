package lesson20.Spotify;

public class Main {
    public static void main(String[] args) {

        Punk punk = new Punk("Punk", "punk", 240);

        Rock rock = new Rock("Rock", "rock", 180);

        Jazz jazz = new Jazz("Jazz", "jazz", 480);
        Podcast podcast = new Podcast("Podcast", 300);

        Playlist<Podcast> podcastPlaylist = new Playlist<>();
        Playlist<Music> musicPlaylist = new Playlist<>();

        punk.getDetails();


        podcastPlaylist.addToList(podcast);
        musicPlaylist.addToList(punk);
        musicPlaylist.addToList(rock);
        musicPlaylist.addToList(jazz);


        musicPlaylist.printDetails();
        podcastPlaylist.printDetails();

    }
}
