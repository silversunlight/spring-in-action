package chapter3.Qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Cold
@Creamy
@Primary
public class IceCream implements Dessert {
    public void taste() {
        System.out.println("this is ice-cream");
    }
}
