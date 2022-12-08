package com.oregoom.mensajes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertMysql {

    public static void main(String[] args) throws SQLException {
        SelectMysql.listarRegistros();
        insertarRegistros("Java", "Keynerrex YT");
        SelectMysql.listarRegistros();
    }

    static void insertarRegistros(String mensaje, String autor) throws SQLException {
        Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC",
                "root", "12345678");

        System.out.println("Conexion Exitosa");

        String sql = "INSERT INTO mensajes(mensaje,autor,fecha) VALUES(?,?,CURRENT_TIME())";
        //Enviar Consulta
        PreparedStatement ps = conectar.prepareStatement(sql);

        ps.setString(1, mensaje);
        ps.setString(2, autor);
        ps.executeUpdate();

        ps.close();
        conectar.close();
    }
}
