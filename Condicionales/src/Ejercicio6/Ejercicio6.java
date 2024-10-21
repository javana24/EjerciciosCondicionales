package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void TiempoCaida(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una altura: ");
        double altura = Integer.parseInt(scanner.nextLine());
        double g = 9.81;

        if (altura > 0) {
            double resultado;
            resultado = Math.sqrt((2*altura)/g);
            System.out.println(resultado);
        }
        else
            System.out.println("Altura incorrecta");
    scanner.close();
    }
    
}
