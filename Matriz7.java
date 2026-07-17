/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz7;

import java.util.Scanner;

/**
 * @author [Tiago Amauri Valdiviezo Pua]
 */
public class Matriz7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int sumaTotal = 0;

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.print("Ingrese valor para [" + f + "][" + c + "]: ");
                matriz[f][c] = leer.nextInt();
                sumaTotal = sumaTotal + matriz[f][c];
            }
        }

        System.out.println("Suma total de todos los elementos: " + sumaTotal);
    }
}