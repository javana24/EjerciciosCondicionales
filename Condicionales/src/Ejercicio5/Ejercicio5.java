package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void EcuacionPrimerGrado() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce un numero para ecuacion: ");
            double num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce un numero para ecuacion: ");
            double num2 = Integer.parseInt(scanner.nextLine());
        
        if (num1!=0) {
            double x;
            x = -num2/num1;
            System.out.println(x);
        }
        else
            System.out.println("Esta ecuación no tiene solución real");
        
        scanner.close();
    }
}
