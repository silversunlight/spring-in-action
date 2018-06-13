package chapter2.javaCodeConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = FruitConfig.class)
public class FruitTest {

    @Autowired
    public Fruit fruit;

    @Test
    public void fruitTest() {
        fruit.taste();
    }
}
