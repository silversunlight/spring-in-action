package chapter2.xmlBeanConfig;

public class BlankDisc implements CD {
    private String title;
    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void cdPlay() {
        System.out.println(title+" "+artist);
    }
}
