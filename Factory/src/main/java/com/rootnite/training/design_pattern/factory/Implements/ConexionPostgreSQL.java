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
public class ConexionPostgreSQL implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionPostgreSQL() {
        this.host = "localhost";
        this.puerto = "5433";
        this.usuario = "postgres";
        this.contrasena = "123";
    }

    public void conectar() {
        // Aqui puede ir código JDBC
        System.out.println("Se conectó a PostgreSQL");

    }

    public void desconectar() {
        System.out.println("Se desconectó de PostgreSQL");
    }

    @Override
    public String toString() {
        return "ConexionPostgreSQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
                + contrasena + "]";
    }
}
