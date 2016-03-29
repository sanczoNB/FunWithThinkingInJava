package typeinfo;

/**
 * Created by maria on 2016-03-29.
 */
public class Position {
    private String title;
    private Person person;

    public Position(String title, Person employee) {
        this.title = title;
        this.person = employee;
        if(person == null)
            person = Person.NULL;
    }

    public Position(String title) {
        this.title = title;
        person = Person.NULL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person newPerson) {
        this.person = newPerson;
        if (person == null)
            person = Person.NULL;
    }

    @Override
    public String toString() {
        return "Etat: " + title + " " + person;
    }
}
