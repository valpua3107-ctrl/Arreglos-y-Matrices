/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz4;

import java.util.Scanner;

/**
 * @author [Tiago Amauri Valdiviezo Pua]
 */
public class Matriz4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[20];
        int cantPares = 0, cantImpares = 0;
        int sumaPares = 0, sumaImpares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el numero entero " + (i + 1) + ": ");
            numeros[i] = leer.nextInt();

            if (numeros[i] % 2 == 0) {
                cantPares++;
                sumaPares = sumaPares + numeros[i];
            } else {
                cantImpares++;
                sumaImpares = sumaImpares + numeros[i];
            }
        }

        System.out.println("Cantidad de numeros pares: " + cantPares);
        System.out.println("Cantidad de numeros impares: " + cantImpares);
        System.out.println("Suma de los pares: " + sumaPares);
        System.out.println("Suma de los impares: " + sumaImpares);
    }
}