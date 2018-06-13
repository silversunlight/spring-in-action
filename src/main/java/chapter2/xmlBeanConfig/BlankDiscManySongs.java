package chapter2.xmlBeanConfig;

import java.util.List;

public class BlankDiscManySongs implements CD {

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDiscManySongs(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void cdPlay() {
        System.out.println("title"+" "+artist);
        for (String track : tracks) {
            System.out.println("-Track "+track);
        }
    }
}
