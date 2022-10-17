
package examen04;
import java.util.*;
import java.lang.Math.*;
import java.util.Scanner.*;

public class Examen04 {

    public static void main(String[] args) {
       
        boolean edadmayor=true;
        boolean edadmayor2=true;
        boolean mayor;
        System.out.println("Dime la edad de dos personas");
        int edad1=new Scanner(System.in).nextInt();
        int edad2=new Scanner(System.in).nextInt();
        
        
        
        edadmayor=edad1>=18;
        edadmayor2=edad2>=18;
        System.out.println("Estas personas son mayores de edad "+edadmayor+" "+edadmayor2);
        mayor=edad1>edad2;
        System.out.println("La primera persona es "+mayor+" de edad");
    }
    
}
