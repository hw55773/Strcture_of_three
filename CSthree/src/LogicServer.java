import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * className:       Server
 * author:          wenhao2002
 * date:            2023/11/1 10:24
 */
public class LogicServer {
    private List<Person> persons = new ArrayList<>();

    public List<Person> getPersons() {
        return persons;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void editPerson(int index, Person newPerson) {
        persons.set(index, newPerson);
    }

    public void deletePerson(int index) {
        persons.remove(index);
    }

    public Person getPerson(int index) {
        return persons.get(index);
    }

}
