/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.miprimerprograma;

import java.math.BigDecimal;

/**
 *
 * @author iker.iglesias
 */
public class Principal {
    
    public static void main(String[] args) {
        //Nom_Classe nom_objecta = new Nom_classe();
        Calculadora calculadora = new Calculadora();
   
        System.out.println("El resultado de la suma es: " 
                + calculadora.suma(4, 2));
        System.out.println("El resultado de la suma con decimales es: "+
                calculadora.suma(new BigDecimal (1.505),new BigDecimal(1.440)));
        
        BigDecimal num1 = new BigDecimal(1.505);
        BigDecimal num2 = new BigDecimal(1.440);
        
        System.out.println("El resultado de la suma con decimales es: "+
                calculadora.suma(num1, num2));
    }
}
