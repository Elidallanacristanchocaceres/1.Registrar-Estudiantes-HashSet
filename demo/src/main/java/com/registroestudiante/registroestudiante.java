package com.registroestudiante;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class registroestudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> estudiantes = new HashSet<>();

        // 1. Pedir la cantidad de estudiantes
        System.out.print("Cuantos estudiantes quieres registrar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
    }
}