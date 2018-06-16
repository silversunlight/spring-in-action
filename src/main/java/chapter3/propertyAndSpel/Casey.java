package chapter3.propertyAndSpel;

import org.springframework.stereotype.Component;

@Component
public class Casey implements Teacher {
    private String name;
    private Integer age;

    public Casey(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public void introduce() {
        System.out.println("My name is "+name+" ,I'm "+age+" years old.");
    }
}
