/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz9;

import java.util.Scanner;

/**
 * @author [Tiago Amauri Valdiviezo Pua]
 */
public class Matriz9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("Ingrese valor para [" + f + "][" + c + "]: ");
                matriz[f][c] = leer.nextInt();
            }
        }

        int mayor = matriz[0][0];
        int menor = matriz[0][0];

        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 5; c++) {
                if (matriz[f][c] > mayor) {
                    mayor = matriz[f][c];
                }
                if (matriz[f][c] < menor) {
                    menor = matriz[f][c];
                }
            }
        }

        System.out.println("Mayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);
    }
}