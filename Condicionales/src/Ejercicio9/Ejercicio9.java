package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void EcuacionSegundoGrado(){
        Scanner scanner = new Scanner(System.in);{
        System.out.println("          EJERCICIO 9           ");
        System.out.println("Este programa resuelve ecuaciones de segundo grado.");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Por favor, introduzca el valor de a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Por favor, introduzca el valor de b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Por favor, introduzca el valor de c: ");
        int c = Integer.parseInt(scanner.nextLine());

        if (a==0 && b==0 && c==0)
            System.out.println("La ecuación tiene infinitas soluciones.");
        else if (a == 0 && b == 0) {
            System.out.println("La ecuación no tiene solución.");
        } 
        else if (a == 0) {
            System.out.println("x= " + (-c / b));
        }
        //FALTA RESOLVER LA ECUCACION Y SACAR LAS DOS X POSIBILADES SI HAY DOS SOLUCIONES
        scanner.close();
    }
}
}
