package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    private String say;

    public Dog(String say) {
        this.say = say;
    }

    @Override
    public String toString() {
        return "I`m a dog";
    }
}
