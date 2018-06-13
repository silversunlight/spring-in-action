package chapter2.javaCodeConfig;

import org.springframework.stereotype.Component;

@Component
public class Apple implements Fruit {
    public void taste() {
        System.out.println("苹果吃起来很脆！");
    }
}
