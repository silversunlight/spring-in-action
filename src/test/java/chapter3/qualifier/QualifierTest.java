package chapter3.qualifier;

import chapter3.Qualifier.Cold;
import chapter3.Qualifier.Dessert;
import chapter3.Qualifier.Fruity;
import chapter3.Qualifier.QualifierConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = QualifierConfig.class)
public class QualifierTest {

    @Autowired
    private Dessert dessert;

    @Autowired
    @Qualifier("cookies")
    private Dessert dessert2;

    @Autowired
    @Qualifier("sweet")
    private Dessert dessert3;

    @Autowired
    @Cold
    @Fruity
    private Dessert dessert4;

    @Test
    public void testDessert() {
        dessert.taste();
    }

    @Test
    public void testDessert2() {
        System.out.println(dessert2.getClass().getName().toString());
    }

    @Test
    public void testDessert3() {
        dessert3.taste();
    }

    @Test
    public void testDessert4() {
        dessert4.taste();
    }
}
