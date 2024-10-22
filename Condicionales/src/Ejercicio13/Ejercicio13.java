package Ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
    public static void NumeroMayor(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduzca un numero: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduzca otro numero para comparar: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduzca un tercer numero para comparar: ");
        int num3 = Integer.parseInt(scanner.nextLine());

        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("Los numeros introducidos de menor a mayor son: "+ num1 + ", "+ num2 + ", "+ num3);
            }
            else {
                System.out.println("Los numeros introducidos de menor a mayor son: "+ num1 + ", "+ num3 + ", "+ num2);                
            }
                
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("Los numeros introducidos de menor a mayor son: "+ num2 + ", "+ num1 + ", "+ num3);
            }
            else {
                System.out.println("Los numeros introducidos de menor a mayor son: "+ num2 + ", "+ num3 + ", "+ num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("Los numeros introducidos de menor a mayor son: "+ num3 + ", "+ num1 + ", "+ num2);
                
            } else {
                System.out.println("Los numeros introducidos de menor a mayor son: "+ num3 + ", "+ num2 + ", "+ num1);
            }
        }
    scanner.close();
    }
}
