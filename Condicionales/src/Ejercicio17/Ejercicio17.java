package Ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {
    public static void UltimoNumero(){
            Scanner scanner = new Scanner(System.in);{
                System.out.println("          EJERCICIO 17          ");
            System.out.println("Este programa te pinta el ultimo numero del valor introducido.");
            System.out.println("Por favor, introduzca un número: ");
            int num1 = Integer.parseInt(scanner.nextLine());


            //
            int UltimoValorDelNumero;
            UltimoValorDelNumero = Math.abs(num1) % 10;

            System.out.println("El utlimo valor del número introducido es: " + UltimoValorDelNumero);

            scanner.close();
        }
    }
}