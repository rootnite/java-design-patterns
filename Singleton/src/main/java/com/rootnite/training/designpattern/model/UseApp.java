/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rootnite.training.designpattern.model;

/**
 *
 * @author Edy Huiza
 */
public class UseApp {

    public static void main(String[] args) {
        //Se crea la instancia de la clase Conexion
        Conexion c = Conexion.getInstance();
        c.conectDB();
        c.disconectDB();
        //Se reutiliza la instancia de clase
        Conexion c2 = Conexion.getInstance();
        c2.conectDB();
        c2.disconectDB();
    }
}
