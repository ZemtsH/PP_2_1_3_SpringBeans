package app.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
@Component
@Scope("singleton")
public class Timer {

    private static final Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}