package org.SucesionImpar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sucesión de Números Impares ===");
        System.out.print("Número de términos para la sucesión: ");
        int n = scanner.nextInt();

        Successionable successionable = new SerieImpar();
        int[] resultado = successionable.getSerieImpar(n);

        System.out.println("Sucesión generada:");
        for (int valor : resultado) {
            System.out.print(valor + " ");
        }

        scanner.close();
    }
}

