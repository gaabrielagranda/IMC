/*
Autor: Gabriela Granda
Fecha: 14/01/24
Objetivo: Calcular el IMC de una persona.
Este programa calcula el Indice de Masa Corporal.
 */

import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.us);
        //Variables
        String name = "";
        int age = 0;
        double weight = 0.0;
        double height = 0.0;
        double IMC = 0.0;

        // Person form
        System.out.println("Person form");
        System.out.println("====================");
        System.out.println();
        System.out.println("Nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Edad: ");
        edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Peso: ");
        peso = scanner.nextDouble();
        System.out.println("Altura: ");
        altura = scanner.nextDouble();
        //End of form

        /*process */
        IMC = weight / (height * height);
    }
}
