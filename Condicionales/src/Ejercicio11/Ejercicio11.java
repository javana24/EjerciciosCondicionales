package Ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void SegundosMedianoche(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduzca una hora del dia: ");
        int hora = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduzca los minutos del dia: ");
        int minutos = Integer.parseInt(scanner.nextLine());

        if (hora > 24 || minutos > 59) {
            System.out.println("Los datos introducidos son erroneos");    
        }
    
        int SegundosQueQuedan = (23 - hora)*3600 + (60 - minutos)*60;
        
        System.out.println("Desde las " + hora + ":" + minutos + " hasta la medianoche faltan " + SegundosQueQuedan + "segundos");
        scanner.close();
    }
}
