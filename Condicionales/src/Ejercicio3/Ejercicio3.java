package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void NumDiaDeLaSemana(){
        Scanner scanner = new Scanner(System.in);{
            System.out.println("          EJERCICIO 3           ");
            System.out.println("Este programa segun el número introducido te dice el dia de la semana que es");
            System.out.println("Introduce un numero para saber su dia de la semana (0 - 7): ");
            int numdia = Integer.parseInt(scanner.nextLine());

                switch (numdia) {
                    case 1:
                    System.out.println("El dia de la semana es Lunes");
                    break;
                    case 2:
                    System.out.println("El dia de la semana es Martes");
                    break;
                    case 3:
                    System.out.println("El dia de la semana es Miércoles");
                    break;
                    case 4:
                    System.out.println("El dia de la semana es Jueves");
                    break;
                    case 5:
                    System.out.println("El dia de la semana es Viernes");
                    break;
                    case 6:
                    System.out.println("El dia de la semana es Sabado");
                    break;
                    case 7:
                    System.out.println("El dia de la semana es Domingo");
                    break;
                    default:
                    System.out.println("La hora del día no es correcta");
                }
            }
        scanner.close();
    }
}