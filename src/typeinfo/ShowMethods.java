package typeinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;
import static net.mindview.util.Print.*;

/**
 * Created by maria on 2016-03-29.
 */
public class ShowMethods {

    private static String usage =
            "Stosowanie:\n" +
            "ShowMethods kwalifikowana.nazwa.klasy\n" +
            "Aby wypisac wszystkie metody klasy albo:\n" +
            "ShowMethods kwalifikowana.nazwa.klasy slowo\n" +
            "Aby wyszukac metody ze slowem 'slowo'";

    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args){
        if(args.length < 1){
            print(usage);
            System.exit(0);
        }
        int lines = 0;

        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            if(args.length == 1){
                for(Method method : methods)
                    print(p.matcher(method.toString()).replaceAll(""));
                for(Constructor ctor : ctors)
                    print(p.matcher(ctor.toString()).replaceAll(""));
                lines = methods.length + ctors.length;
            }else {
                for(Method method : methods)
                    if (method.toString().indexOf(args[1]) != -1){
                        print(p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }
                for(Constructor ctor : ctors)
                    if(ctor.toString().indexOf(args[1]) != -1) {
                        print(p.matcher(ctor.toString()).replaceAll(""));
                        lines++;
                    }
            }
        } catch (ClassNotFoundException e) {
            print("Brak klasy: " + e);
        }
    }
}
