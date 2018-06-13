package chapter2.javaCodeConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FruitConfig {
    @Bean
    public Fruit fruit() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0)
            return new Apple();
        else if (choice == 1)
            return new Watermelon();
        else
            return new Banana();
    }
}
