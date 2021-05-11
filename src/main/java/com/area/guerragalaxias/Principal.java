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
public class Principal {

    public static void main(String[] args) {
        Jedi lukeSkywalker = new Jedi("Luke Skywalker", "Azul");
        Jedi maceWindu = new Jedi("Mace Windu", "Morado");
        Jedi yoda = new Jedi("Yoda", "Verde");
        Jedi quigonJinn = new Jedi("Qui-Gon Jinn", "Verde");
        Jedi obiwanKenobi = new Jedi("Obi-Wan Kenobi", "azul");

        lukeSkywalker.mostrar();
        maceWindu.mostrar();
        yoda.mostrar();
        quigonJinn.mostrar();
        obiwanKenobi.mostrar();
    }
}
