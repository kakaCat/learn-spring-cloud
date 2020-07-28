package learn.spring.portal;

import org.springframework.beans.factory.annotation.Value;

public class Student {



    private String name;
    private int age;

    @Value("${name}")
    private String className;

    public void init(){
        this.name = "heheh";
        this.age = 18;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                '}';
    }
}
