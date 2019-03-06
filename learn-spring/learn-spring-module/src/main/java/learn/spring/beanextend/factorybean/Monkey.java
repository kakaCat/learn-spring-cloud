package learn.spring.beanextend.factorybean;

public class Monkey implements Animal {

    @Override
    public void move(){
        System.out.println("Monkey move!");
    }
}
