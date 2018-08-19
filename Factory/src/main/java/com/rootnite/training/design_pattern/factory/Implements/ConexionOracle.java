/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rootnite.training.design_pattern.factory.Implements;

import com.rootnite.training.design_pattern.factory.Interface.IConexion;

/**
 *
 * @author Edy Huiza
 */
public class ConexionOracle implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionOracle() {
        this.host = "localhost";
        this.puerto = "1521";
        this.usuario = "admin";
        this.contrasena = "123";
    }

    public void conectar() {
        // Aqui puede ir código JDBC
        System.out.println("Se conectó a Oracle");

    }

    public void desconectar() {
        System.out.println("Se desconectó de Oracle");
    }

    @Override
    public String toString() {
        return "ConexionOracle [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
                + contrasena + "]";
    }
}
