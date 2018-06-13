package chapter2.autowiring;

import org.springframework.stereotype.Component;

/**
 * 如果没有命名，spring会自动根据类名给bean分配一个id，此例就是sgtPeppers
 * ，如果想要自己标识bean ID，可以
 * @Component("mycd")
 * 也可以使用Java依赖注入规范，Java Dependency Injection 中提供的
 * @Named("mycd") 来为bean设置ID
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "八十年代的歌";
    private String artist = "赵雷";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
