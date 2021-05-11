/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.decisiones;

import java.util.Scanner;

/**
 *
 * @author iker.iglesias
 */
public class Principal {

    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        num2 = scanner.nextInt();

        scanner.close();

        //Java stringbuilder vs strinbuffer vs concatenation(+)
        if (num1 > num2) {
            System.out.println("El numero " + num1
                    + " es mayor que el numero " + num2);
        } else {
            System.out.println("El numero " + num1
                    + " es menor que el numero " + num1);
        }
    }
}
