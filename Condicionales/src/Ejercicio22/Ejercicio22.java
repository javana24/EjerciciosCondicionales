package Ejercicio22;

import java.util.Scanner;

public class Ejercicio22 {

    public static void minutosHastaFinDeSemana() {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario el día de la semana y la hora
        System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
        String diaSemana = scanner.nextLine().toLowerCase();
        
        System.out.print("A continuación introduzca la hora (hora y minutos)\nHora: ");
        int hora = scanner.nextInt();
        System.out.print("Minutos: ");
        int minutos = scanner.nextInt();

        // Convertimos todo a minutos para facilitar los cálculos
        int minutosTotalesDia = 24 * 60; // Minutos en un día
        int minutosHastaFinDeSemana;

        // Calculamos los minutos restantes según el día de la semana
        switch (diaSemana) {
            case "lunes":
                minutosHastaFinDeSemana = 4 * minutosTotalesDia + (15 * 60 - hora * 60 - minutos);
                break;
            case "martes":
                minutosHastaFinDeSemana = 3 * minutosTotalesDia + (15 * 60 - hora * 60 - minutos);
                break;
            case "miércoles", "miercoles":
                minutosHastaFinDeSemana = 2 * minutosTotalesDia + (15 * 60 - hora * 60 - minutos);
                break;
            case "jueves":
                minutosHastaFinDeSemana = minutosTotalesDia + (15 * 60 - hora * 60 - minutos);
                break;
            case "viernes":
                minutosHastaFinDeSemana = 15 * 60 - hora * 60 - minutos;
                break;
            default:
                System.out.println("Día de la semana inválido.");
                return;
        }
        scanner.close();
        System.out.println("Faltan " + minutosHastaFinDeSemana + " minutos para llegar al fin de semana.");

    }
}

