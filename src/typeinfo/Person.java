package typeinfo;

import net.mindview.util.Null;

/**
 * Created by maria on 2016-03-29.
 */
public class Person {
    public final String first;
    public final String last;
    public final String address;
    //itd.

    public Person(String first, String last, String address){
        this.first = first;
        this.last = last;
        this.address = address;
    }


    public String toString() {
        return "Osoba: " + first + " " + last + " " + address;
    }

    public static class NullPerson extends Person implements Null {

        public NullPerson() {
            super("None", "None", "None");
        }

        @Override
        public String toString() {
            return "NullPerson";
        }
    }

    public static final Person NULL = new NullPerson();
}
