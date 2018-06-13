package chapter2.xmlBeanConfig;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
    private CD cd;

//    public CDPlayer(CD cd) {
//        this.cd = cd;
//    }


     @Autowired
    public void setCD(CD cd) {
        this.cd=cd;
    }
    public void play() {
        System.out.println("this is CDPlayer");
        cd.cdPlay();
    }
}
