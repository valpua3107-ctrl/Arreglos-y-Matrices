/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz2;

import java.util.Scanner;

/**
 * @author [Tiago Amauri Valdiviezo Pua]
 */
public class Matriz2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero real " + (i + 1) + ": ");
            numeros[i] = leer.nextDouble();
            suma = suma + numeros[i];
        }

        double promedio = suma / 10;

        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}