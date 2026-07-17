/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz5;

import java.util.Scanner;

/**
 * @author [Tiago Amauri Valdiviezo Pua]
 */
public class Matriz5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[12];
        int valor;

        for (int i = 0; i < 12; i++) {
            do {
                System.out.print("Ingrese un numero positivo para la posicion " + i + ": ");
                valor = leer.nextInt();
                if (valor <= 0) {
                    System.out.println("El numero debe ser positivo (mayor a cero). Intente de nuevo.");
                }
            } while (valor <= 0);

            numeros[i] = valor + i;
        }

        System.out.println("Arreglo modificado resultante:");
        for (int i = 0; i < 12; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}