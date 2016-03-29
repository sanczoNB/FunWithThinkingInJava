package typeinfo.pets;

import java.util.ArrayList;

/**
 * Created by maria on 2016-03-27.
 */
public class Pets {
    public static final PetCreator creator =
            new LiteralPerCreator();
    public static Pet randomPet() {
        return creator.randomPet();
    }
    public static Pet[] createArray(int size)
    {
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayListList(int size){
        return creator.arrayList(size);
    }
}
