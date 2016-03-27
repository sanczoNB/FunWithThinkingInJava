package typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sanczo on 2016-03-26.
 */
public class ForNameCreator extends PetCreator {

    private static List<Class<? extends Pet>> types =
            new ArrayList<>();
    //Typy, ktore maja byc uzwglednione przy losowaniu
    private static String[] typeNames = {
            "typeinfo.pets.Mutt",
            "typeinfo.pets.Pug",
            "typeinfo.pets.EgyptianMau",
            "typeinfo.pets.Manx",
            "typeinfo.pets.Cymric",
            "typeinfo.pets.Rat",
            "typeinfo.pets.Mouse",
            "typeinfo.pets.Hamster"
    };

    private static void loader() {
        try {
            for(String name : typeNames)
                types.add(
                        (Class<? extends Pet>)Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static { loader();}
    public List<Class<? extends Pet>> types() {return types;}
}
