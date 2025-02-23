package com.registroestudiante;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class registroestudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> estudiantes = new HashSet<>();

        // 1.cantidad de estudiantes
        System.out.print("Cuantos estudiantes quieres registrar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); 

        // 2.solicitar nombres
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            if (!estudiantes.add(nombre)) {
                System.out.println("⚠ El estudiante '" + nombre + "' ya está registrado.");
            }
        }

        // 3.mostrar la lista
        System.out.println("\nLista de estudiantes registrados:");
        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }

    }
}