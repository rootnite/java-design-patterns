package com.rootnite.training.design_pattern.factory;

import com.rootnite.training.design_pattern.factory.Implements.ConexionOracle;
import com.rootnite.training.design_pattern.factory.Implements.ConexionPostgreSQL;
import com.rootnite.training.design_pattern.factory.Implements.ConexionSQLServer;
import com.rootnite.training.design_pattern.factory.Implements.ConexionVacia;
import com.rootnite.training.design_pattern.factory.Interface.IConexion;

/**
 *
 * @author Edy Huiza
 */
public class ConexionFactory {

    public IConexion getConexion(String motor) {
        if (motor == null) {
            return new ConexionVacia();
        }
        if (motor.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();
        } else if (motor.equalsIgnoreCase("POSTGRESQL")) {
            return new ConexionPostgreSQL();
        } else if (motor.equalsIgnoreCase("SQL SERVER")) {
            return new ConexionSQLServer();
        }

        return new ConexionVacia();
    }
}
