package chapter3.properitesAndSpel;

import chapter3.propertyAndSpel.Teacher;
import chapter3.propertyAndSpel.TeacherConfig;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TeacherConfig.class)
public class Test {
    @Autowired
    @Qualifier("dominica")
    private Teacher teacher;

    @Autowired
    @Qualifier("notexists")
    private Teacher teacher1;

    @Autowired
    @Qualifier("casey")
    private Teacher teacher2;

    @Autowired
    @Qualifier("ria")
    private Teacher teacher3;

    @Autowired
    @Qualifier("mira")
    private Teacher teacher4;

    @Autowired
    @Qualifier("belle")
    private Teacher teacher5;

    @org.junit.Test
    public void testDominica() {
        teacher.introduce();
    }



    @org.junit.Test
    public void testDefaultTeacher() {
        teacher1.introduce();
    }

    @org.junit.Test
    public void testCasey() {
        teacher2.introduce();
    }

    @org.junit.Test
    public void testRia() {
        teacher3.introduce();
    }

    @org.junit.Test
    public void testMira() {
        teacher4.introduce();
    }

    @org.junit.Test
    public void testBelle() {
        teacher5.introduce();
    }
}
