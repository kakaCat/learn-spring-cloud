package learn.spring.beanextend.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class AnimalFactoryBean implements FactoryBean<Animal> {


    private String    animal;

    @Override
    public Animal getObject() throws Exception {
        if ("Monkey".equals(animal))
        {
            return new Monkey();
        }
        else if ("Tiger".equals(animal))
        {
            return new Tiger();
        }
        else
        {
            return null;
        }
    }
    @Override
    public Class<?> getObjectType() {
        return Animal.class;
    }
    @Override
    public boolean isSingleton() {
        return true;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
}
