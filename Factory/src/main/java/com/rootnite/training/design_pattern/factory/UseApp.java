/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rootnite.training.design_pattern.factory;

import com.rootnite.training.design_pattern.factory.Interface.IConexion;

/**
 *
 * @author Edy Huiza
 */
public class UseApp {

    public static void main(String[] args) {
        ConexionFactory factory = new ConexionFactory();

        IConexion c1 = factory.getConexion("ORACLE");
        c1.conectar();
        c1.desconectar();
        c1.toString();

        IConexion c2 = factory.getConexion("Postgresql");
        c2.conectar();
        c2.desconectar();

        IConexion c3 = factory.getConexion("H2");
        c3.conectar();
        c3.desconectar();
    }
}
