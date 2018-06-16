package chapter4.cdplayer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class CDconfig {
    @Bean
    public CD getAnHeQiao() {
        BlankCD cd=new BlankCD();
        cd.setTitle("安河桥北");
        cd.setArtist("宋东野");
        List<String> tracks = new ArrayList<String>();
        tracks.add("安河桥");
        tracks.add("莉莉安");
        tracks.add("抱着盒子的姑娘");
        tracks.add("董小姐");
        tracks.add("斑马斑马");
        tracks.add("关忆北");
        tracks.add("鸽子");
        tracks.add("卡比巴拉的海");
        tracks.add("六层楼");
        cd.setTracks(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }


}
