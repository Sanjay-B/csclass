/**
 * Created by sanja on 8/25/2017.
 */

package csap.api;
import javax.naming.InsufficientResourcesException;
import java.lang.String;

public class Str {

    /*print(string)
        *
        * Prints string to output(also known as console)
        * Params: string str
        */
    public static void print(String str){
        String x = str;
        System.out.print(x);
    }

    /*printl(string)
        *
        * Prints string to output(also known as console)
        * Params: string str
        */
    public static void printl(String str){
        String x = str;
        System.out.println(x);
    }

    /*printa(array)
        *
        * Prints array to output(also known as console)
        * Params: String array
        */
    public void printa(String[] array){
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                print(", ");
            }
            print(array[i]);
        }
    }
}
