package chapter3.Qualifier;

import org.springframework.stereotype.Component;

@Component
public class Cookies implements Dessert {
    public void taste() {
        System.out.println("this is cookies");
    }
}
