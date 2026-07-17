/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz1;

import java.util.Scanner;

/**
 * @author [Tiago Amauri Valdiviezo Pua]
 */
public class Matriz1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[10];

        // Lectura de datos
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero entero para la posicion " + i + ": ");
            numeros[i] = leer.nextInt();
        }

        // Despliegue de datos
        for (int i = 0; i < 10; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
    }
}