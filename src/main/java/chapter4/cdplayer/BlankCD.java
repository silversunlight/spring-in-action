package chapter4.cdplayer;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BlankCD implements CD {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankCD() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public BlankCD(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("cd name: " + title + " by artist: " + artist);
        for (String track : tracks) {
            int i = 1;
            System.out.println("曲目" + (i++) + track);
        }
    }

    public void playTrack(int track) {
        System.out.println("play track: " + track + " " + tracks.get(track));
    }
}
