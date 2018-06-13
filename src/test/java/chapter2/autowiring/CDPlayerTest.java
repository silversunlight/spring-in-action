package chapter2.autowiring;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();
    @Autowired
    private CompactDisc cd;
    @Autowired
    private MediaPlayer player;

    @Test
    public void cdShouldNotBeNull() {
        Assert.notNull(cd);
        cd.play();
    }

    @Test
    public void play() {
        player.play();
        org.junit.Assert.assertEquals("Playing 八十年代的歌 by 赵雷\n", log.getLog());
    }
}
