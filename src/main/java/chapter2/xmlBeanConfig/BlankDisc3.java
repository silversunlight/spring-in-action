package chapter2.xmlBeanConfig;

import java.util.List;

public class BlankDisc3 implements CD {
    private String title;
    private String artist;
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }


    public void cdPlay() {
        System.out.println(title+" "+artist);
        for (String track : tracks) {
            System.out.println("-Track: "+track);
        }
    }
}
