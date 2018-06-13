package chapter2.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    //@Auwowired 注解不仅可以用在构造器上，还可以用在属性的Setter方法上
    //也可以用在类的任何方法上
    //@Inject注解是Java依赖注入规范提供的注解，和@Autowired有基本相同的功能
    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
