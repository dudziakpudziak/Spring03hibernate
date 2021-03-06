package pl.coderslab.person;

import java.util.List;

public interface PersonDao {
    void save(Person person);

    void update(Person person);

    Person find(Long id);

    void delete(Long id);

    List<Person> findAll();
}
