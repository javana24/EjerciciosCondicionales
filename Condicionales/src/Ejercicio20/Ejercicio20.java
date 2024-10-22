package Ejercicio20;

import java.util.Scanner;

    public class Ejercicio20 {
        public static void NumeroCapicuo(){
            Scanner scanner = new Scanner (System.in);
            System.out.print("Introduzca un número de como máximo 5 cifras: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            if (num1 < 10) {
                System.out.println("El numero "+ num1+ " Es capicuo");
            } else if (num1 < 100) {
                int resultado;
                int resultado2;
                resultado = num1/10;
                resultado2 = num1%10;
                if (resultado == resultado2) {
                    System.out.println(num1 +"es capicuo");
                } else {
                    System.out.println(num1 + " No es capicuo");
                }
            }   else if (num1 < 1000) {
                    int resultado;
                    int resultado2;
                    int aux;
                    resultado = num1/100;
                    aux = num1%100; 
                    resultado2 = num1%10;
                    if (resultado == resultado2) {
                        System.out.println(num1+ "Es capicuo");
                    } else {
                        System.out.println(num1+ " no es capicuo");
                    }
                        
                
            }   else if (num1 < 10000) {
                    int resultado;
                    resultado = num1%1000;
            }
    }
}