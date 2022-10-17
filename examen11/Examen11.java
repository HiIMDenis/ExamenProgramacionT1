package examen11;

import java.util.*;
import java.lang.Math.*;
import java.util.Scanner.*;

public class Examen11 {

    public static void main(String[] args) {
      
        System.out.println("Introduce un anio");
        int anio=new Scanner(System.in).nextInt();
       
        if ((anio%4==0)&& anio%100 !=0 || anio%400==0){
            System.out.println("el anio es bisiesto");
        }else{
            System.out.println("el anio no es bisiesto");
        }
        
    }
}