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
public class ConexionVacia implements IConexion {

    public void conectar() {
        System.out.println("No se especificó gestor de base de datos");
    }

    public void desconectar() {
        System.out.println("No se especificó gestor de base de datos");
    }
}
