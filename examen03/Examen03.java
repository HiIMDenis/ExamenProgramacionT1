package examen03;
import java.util.*;
import java.lang.Math.*;
import java.util.Scanner.*;

public class Examen03 {

    public static void main(String[] args) {
        
        int segundostotales;
        
        System.out.println("Dime 3 numeros enteros");
        int horas=new Scanner(System.in).nextInt();
        int minutos=new Scanner(System.in).nextInt();
        int segundos=new Scanner(System.in).nextInt();
        
        segundostotales=(horas*3600)+(minutos*3600)+segundos;
        System.out.println("Esta es la cantidad de segundos que hay "+segundostotales);
    }
    
}
