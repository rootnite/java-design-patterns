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
public class Conexion {

    private static Conexion instance;

    //Para evitar crear una nueva instancia con el operador new
    private Conexion() {

    }

    //Notese la palabra reservada "static" hace posible el acceso mediante Clase.metodo
    public static Conexion getInstance() {
        if (instance == null) {
            instance = new Conexion();
        }
        return instance;
    }

    public boolean conectDB() {
        System.out.println("Conexion realizada con exito");
        return true;
    }

    public boolean disconectDB() {
        System.out.println("Conexion realizada con exito");
        return true;
    }
}
