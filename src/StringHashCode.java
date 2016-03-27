/**
 * Created by sanczo on 2016-03-26.
 */
public class StringHashCode {
    public static void main(String[] args){
        String hello1 = new String("Hello");
        String hello2 = new String("Hello");

        System.out.println(hello1.hashCode());
        System.out.println(hello2.hashCode());
    }

}
