package chapter3.Qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sweet")
public class Cake implements Dessert {
    public void taste() {
        System.out.println("this is cake");
    }
}
