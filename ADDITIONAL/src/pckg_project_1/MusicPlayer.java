package pckg_project_1;

public class MusicPlayer extends MediaDevice {
    private int currentSong;
    private PlayList playList;

    protected MusicPlayer(String brand, String model) {
        super(brand, model);
        this.currentSong = 0;
        this.playList = new PlayList();
    }

    public void addNewSongToPlaylist(Song song) {
        playList.addSong(song);
    }

    @Override
    public void initializeBaseMediaDevice() {
        playList.initSongList(5);
    }

    private class PlayList {
        Song[] songs;
        static final int CAPACITY = 10;

        public PlayList() {
            this.songs = new Song[CAPACITY];
        }

        public Song[] getSongsFromPlaylist() {
            return songs;
        }

        public void addSong(Song song) {
            int index = checkFreeSlots();
            if (index != -1) {
                songs[index] = song;
                System.out.println("New song added to playlist");
            }
            else {
                System.out.println("Playlist already full, unable to add song");
            }
        }

        private int checkFreeSlots() {
            for (int i = 0; i < CAPACITY; i++) {
                if (songs[i] == null) {
                    return i;
                }
            }
            return -1;
        }

        void removeSong(int songIdxPos) {
            if(songIdxPos >= 0 && songIdxPos < songs.length) {
                songs[songIdxPos] = null;
            }
        }

        void initSongList(int numSongs) {
            if(numSongs < songs.length) {
                for(int i = 0; i < numSongs; i++) {
                    songs[i] = new Song("Song: " + i, "Some artist...");
                }
                System.out.println("Playlist initialized!");
            }
        }
    }

    @Override
    public void turnONDevice() {

    }

    @Override
    public void play() {
        System.out.println("Playing: " + currentSong);
    }

    @Override
    public void pause() {
        System.out.println("Pausing: " + currentSong);
    }

    @Override
    public void stop() {
        System.out.println("Stopping music player");
    }

    @Override
    public void next() {
        if (currentSong == this.playList.getSongsFromPlaylist().length - 1) {
            currentSong = 0;
        }
        else {
            currentSong++;
        }
        System.out.println("Going to: " + currentSong);
    }

    @Override
    public void previous() {
        if (currentSong == 0) {
            currentSong = playList.getSongsFromPlaylist().length - 1;
        }
        else {
            currentSong--;
        }
        System.out.println("Going to: " + currentSong);
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", playList=" + playList +
                ", currentSong=" + currentSong +
                '}';
    }
}
