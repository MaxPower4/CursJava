/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.bucles;

/**
 *
 * @author iker.iglesias
 */
public class EjemploBucles {
    public static void main(String[] args) {
        
        int array[];
        array = new int[10];
        int i = 0;
        
        for(i = 0; i < array.length;i++){
            array[i] = i;
            System.out.println("array["+ i +"]: " + array[i]);
        }
        
        //Realizamos un reset de la variable i
        i = 0;
        
        //While & do while
        System.out.println("\n Prueba Con WHILE");
        
        while(i < array.length){
            array[i] = i;
            System.out.println("array["+ i +"]: " + array[i]);
            i++;
        }
        
        System.out.println("\n Prueba con DO WHILE");
        
        //Realizamos un reset de la variable i
        i = 0;        
        do{
            array[i] = i;
            System.out.println("array["+ i +"]: " + array[i]);
            i++;
        }while(i < array.length);
    }
}
