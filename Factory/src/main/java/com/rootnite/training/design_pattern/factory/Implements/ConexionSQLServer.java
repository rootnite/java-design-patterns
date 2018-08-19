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
public class ConexionSQLServer implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionSQLServer() {
        this.host = "localhost";
        this.puerto = "1433";
        this.usuario = "root";
        this.contrasena = "123";
    }

    public void conectar() {
        // Aqui puede ir código JDBC
        System.out.println("Se conectó a SQLServer");

    }

    public void desconectar() {
        System.out.println("Se desconectó de SQLServer");
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
