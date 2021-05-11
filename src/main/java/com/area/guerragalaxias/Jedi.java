/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.guerragalaxias;

/**
 *
 * @author iker.iglesias
 */
public class Jedi {

    //El ámbito por defecto en java es de package
    //Atributos de objecto
    String nombre;
    String colorSableLuz;

    //ámbito nombre_classe (parametros)
    //En el constructor inicializamos los atributos del objecto del tipo Jedi
    //Este constructor se llamará cuando se realice un new de la classe Jedi
    public Jedi(String nombre, String colorSableLuz) {
        this.nombre = nombre;
        this.colorSableLuz = colorSableLuz;
    }

    //Método de objecto
    public void mostrar() {
        System.out.println("Soy un Jedi, mi nombre es " + this.nombre
                + " y el color de mi sable de luz es " + this.colorSableLuz);
    }

}
