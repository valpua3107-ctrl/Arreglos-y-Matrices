/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz10;

import java.util.Scanner;

/**
 * @author [Tiago Amauri Valdiviezo Pua]
 */
public class Matriz10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][5];

        // Llenado aplicando la formula solicitada
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("Ingrese valor para [" + f + "][" + c + "]: ");
                int ingresado = leer.nextInt();
                matriz[f][c] = ingresado + (f * c);
            }
        }

        // Impresion de la matriz modificada
        System.out.println("Matriz modificada resultante:");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }
}