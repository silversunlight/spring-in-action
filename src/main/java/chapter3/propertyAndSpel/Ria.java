package chapter3.propertyAndSpel;

import org.springframework.stereotype.Component;

@Component
public class Ria implements Teacher {
    private String name;
    private String age;

    public Ria(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("My name is " + name + " ,I'm " + age + " years old.");
    }
}
