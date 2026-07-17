/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz8;

import java.util.Scanner;

/**
 * @author [Tiago Amauri Valdiviezo Pua]
 */
public class Matriz8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.print("Ingrese valor para [" + f + "][" + c + "]: ");
                matriz[f][c] = leer.nextInt();
            }
        }

        int sumaDiagonal = 0;
        System.out.println("Elementos de la diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
            sumaDiagonal = sumaDiagonal + matriz[i][i];
        }
        System.out.println();
        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
    }
}