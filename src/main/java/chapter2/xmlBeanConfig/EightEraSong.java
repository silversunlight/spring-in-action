package chapter2.xmlBeanConfig;

public class EightEraSong implements CD {

    private String title = "八十年代的歌";
    private String artist = "赵雷";



    public void cdPlay() {
        System.out.println(title + " " + artist);
    }
}
