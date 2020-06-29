package demo.core.services;

import demo.core.data.models.Person;
import demo.core.data.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    @Autowired(required=true)
    PersonRepository repo;

    public void addPerson(Person p)
    {
         repo.save(p);
    }

}
