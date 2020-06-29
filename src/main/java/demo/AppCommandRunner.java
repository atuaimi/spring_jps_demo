package demo;

import demo.core.data.models.Person;
import demo.core.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppCommandRunner implements CommandLineRunner {

    // THIS CLASS IS FOR RUNNING QUICK TESTS ONLY OR USE "ApplicationRunner" CLASS FOR NECESSARY INITIALIZATIONS

    @Autowired
    DBService db;

    @Override
    public void run(String...args) throws Exception {
        Person p = new Person();
        p.setMessage("Hello Spring Boot!");
        p.setName("Test Name");
        p.setComment("Test Comment");
        db.addPerson(p);

    }
}
