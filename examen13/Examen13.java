package examen13;

import java.util.*;
import static java.lang.Math.pow;
import java.util.Scanner.*;


public class Examen13 {

   
    public static void main(String[] args) {
       
        System.out.println("Dime el radio");
        double radio = new Scanner(System.in).nextDouble();
         
        final double pi = 3.1416;
        double area = pi * (pow(radio,2));
        
        System.out.println("El area del circulo es: "+area);
        
        
        
        
        
        
        
    }
    
}
