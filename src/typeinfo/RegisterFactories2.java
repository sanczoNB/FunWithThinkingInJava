package typeinfo;

import typeinfo.factory.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by maria on 2016-03-27.
 */


class Part2{
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Class<? extends Part2>> partFactories =
            new ArrayList<>();

    static {
        //Metoda Collections.addAll() powoduje ostrzezenie
        //"unchecked generic array creation ... for varargs parameter".
        partFactories.add(FuelFilter2.class);
        partFactories.add(AirFilter2.class);
        partFactories.add(CabinAirFilter2.class);
        partFactories.add(OilFilter2.class);
        partFactories.add(FanBelt2.class);
        partFactories.add(PowerSteeringBelt2.class);
        partFactories.add(GeneratorBelt2.class);
    }
    private static Random rand = new Random(47);

    public static Part2 createRandom() throws IllegalAccessException, InstantiationException {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).newInstance();
    }

}



class Filter2 extends Part2 {};

class FuelFilter2 extends Filter2 {
    //Utworzenie wyytworni dla kazdego konkretnego typu:

}

class AirFilter2 extends Filter2{

}

class CabinAirFilter2 extends Filter2{

}

class OilFilter2 extends Filter2{

}

class Belt2 extends Part2 {}

class FanBelt2 extends Belt2 {

}

class GeneratorBelt2 extends Belt2 {

}

class PowerSteeringBelt2 extends Belt2{
  public PowerSteeringBelt2(int c){

  }
    public PowerSteeringBelt2()
    {

    }
}

public class RegisterFactories2 {
    public static void main(String[] args){
        try {
            for(int i = 0; i < 10; i++)
                System.out.println(Part2.createRandom());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}