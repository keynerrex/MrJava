package com.oregoom.mensajes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteMysql {

    public static void main(String[] args) throws SQLException {
        SelectMysql.listarRegistros();
        borrarRegistros(8);
        SelectMysql.listarRegistros();

    }

    static void borrarRegistros(int id) throws SQLException {
        Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC",
                "root", "12345678");

//        System.out.println("Conexion Exitosa");
        String sql = "DELETE FROM mensajes WHERE id_mensaje = ?";
        //Enviar Consulta
        PreparedStatement ps = conectar.prepareStatement(sql);

        ps.setInt(1, id);
        ps.executeUpdate();

        ps.close();
        conectar.close();
    }
}
