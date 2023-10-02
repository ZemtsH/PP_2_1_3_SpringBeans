package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
            AnimalsCage animalCage = applicationContext.getBean(AnimalsCage.class);
            animalCage.whatAnimalSay();
        }

    }
}
