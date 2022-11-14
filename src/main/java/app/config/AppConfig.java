package app.config;

import app.model.Animal;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import app.model.Cat;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean(name = "cat")
    public Animal getCat() {
        Animal animal = new Cat("Мяу что ли");
        return animal;
    }
    @Bean(name = "dog")
    public Animal getDog() {
        Dog dog = new Dog("Гав что ли");
        return dog;
    }

    @Bean(name = "Timer")
    public Timer getTimer() {
        Timer timer = new Timer();
        return timer;
    }
}