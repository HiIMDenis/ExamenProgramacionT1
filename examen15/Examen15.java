package examen15;
import java.util.*;
import java.lang.Math.*;
import java.util.Scanner.*;
public class Examen15 {

   
    public static void main(String[] args) {
      
        boolean X=true;
        boolean Y=false;
        boolean Z=true;
        
        System.out.println(X || Y || X && !Z && !Y);
        System.out.println((X || !Y) && (!X || Z));
        System.out.println(!X || !Y || Z && X && !Y);

        
        
        
    }
    
}
