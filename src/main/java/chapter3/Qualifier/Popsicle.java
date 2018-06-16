package chapter3.Qualifier;

import org.springframework.stereotype.Component;

@Component
@Fruity
@Cold
public class Popsicle implements Dessert {
    public void taste() {
        System.out.println("this is popsicle");
    }
}
