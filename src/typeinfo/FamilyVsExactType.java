package typeinfo;

import static net.mindview.util.Print.*;
/**
 * Created by maria on 2016-03-28.
 */
public class FamilyVsExactType {
    static void test(Object x) {
        print("Testowanie x typu " + x.getClass());
        print("x instanceof Base " + (x instanceof Base));
        print("x instanceof Derived " + (x instanceof Derived));
        print("Base.isInstance(x) " + Base.class.isInstance(x));
        print("Derived.isInstance(x)" + Derived.class.isInstance(x));
        print("x.getClass() == Base.class " + (x.getClass() == Base.class));
        print("x.getClass() == Derived.class " + (x.getClass() == Derived.class));
        print("x.getClass().equals(Base.class) " + x.getClass().equals(Base.class));
        print("x.getClass().equals(Derived.class) " + x.getClass().equals(Derived.class));
    }
    public static void main(String[] args){
        test(new Base());
        test(new Derived());
    }
}
