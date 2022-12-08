package com.oregoom.mensajes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateMysql {

    public static void main(String[] args) throws SQLException {
        SelectMysql.listarRegistros();
        actualizarRegistros("Java Con Linux", "Keynersito WTF", 4);
        SelectMysql.listarRegistros();

    }

    static void actualizarRegistros(String mensaje, String autor, int id) throws SQLException {
        Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC",
                "root", "12345678");

//        System.out.println("Conexion Exitosa");
        String sql = "UPDATE mensajes SET mensaje = ?, autor = ? WHERE id_mensaje = ? ";
        //Enviar Consulta
        PreparedStatement ps = conectar.prepareStatement(sql);

        ps.setString(1, mensaje);
        ps.setString(2, autor);
        ps.setInt(3, id);
        ps.executeUpdate();

        ps.close();
        conectar.close();
    }
}
