package demo.core.data.repositories;

import demo.core.data.models.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
    // Spring will take care of implementing this class !!
}
