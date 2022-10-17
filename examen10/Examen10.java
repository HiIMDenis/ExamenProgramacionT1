package examen10;

import java.util.*;
import java.lang.Math.*;
import java.util.Scanner.*;

public class Examen10 {

    public static void main(String[] args) {
        
        int t;
        int mayor;
        
        System.out.println("Dime 3 numeros enteros");
        int n1=new Scanner(System.in).nextInt();
        int n2=new Scanner(System.in).nextInt();
        int n3=new Scanner(System.in).nextInt();
        
        if (n1>n2){
            t=n1;
        }else{
            t=n2;
        }
        if (t>n3){
            mayor=t;
        }else{
            mayor=n3;
            
        }
        System.out.println("El mayor es "+mayor);
        
    }
    
}
