/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz6;

import java.util.Scanner;

/**
 * @author [Tiago Amauri Valdiviezo Pua]
 */
public class Matriz6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        // Llenado de matriz
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.print("Ingrese valor para la posicion [" + f + "][" + c + "]: ");
                matriz[f][c] = leer.nextInt();
            }
        }

        // Impresion con formato
        System.out.println("Matriz resultante:");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }
}