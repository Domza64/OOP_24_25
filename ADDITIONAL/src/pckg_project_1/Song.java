package pckg_project_1;

public class Song {

    private String songName;
    private String artist;

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
