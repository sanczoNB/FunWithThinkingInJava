package typeinfo.pets;

import java.util.Collections;
import java.util.List;

/**
 * Created by maria on 2016-03-27.
 */
public class LiteralPerCreator extends PetCreator {

    @SuppressWarnings("unchecked")
    public static final List<Class <? extends Pet>> allTypes =
            Collections.unmodifiableList(java.util.Arrays.<Class<? extends Pet>>asList(
                    Pet.class, Dog.class, Cat.class, Rodent.class, Mutt.class, Pug.class,
                    EgyptianMau.class, Manx.class, Cymric.class, Rat.class, Mouse.class, Hamster.class, Gerbil.class));
    //Typy do losowania

    private static final List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args){
        System.out.println(types);
    }
}
