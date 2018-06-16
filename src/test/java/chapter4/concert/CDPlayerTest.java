package chapter4.concert;

import chapter4.cdplayer.CD;
import chapter4.cdplayer.CDconfig;
import chapter4.cdplayer.TrackCounter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDconfig.class)
public class CDPlayerTest {
    @Autowired
    private CD cd;

    @Autowired
    private TrackCounter counter;


    @Test
    public void countTrack() {
        cd.playTrack(1);
        cd.playTrack(2);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(7);
        cd.playTrack(7);

        org.junit.Assert.assertEquals(1, counter.getPlayCount(1));
        org.junit.Assert.assertEquals(1, counter.getPlayCount(1));
        org.junit.Assert.assertEquals(4, counter.getPlayCount(3));
        org.junit.Assert.assertEquals(0, counter.getPlayCount(4));
        org.junit.Assert.assertEquals(0, counter.getPlayCount(5));
        org.junit.Assert.assertEquals(0, counter.getPlayCount(6));
        org.junit.Assert.assertEquals(2, counter.getPlayCount(7));
    }

}
