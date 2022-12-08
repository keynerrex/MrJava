package com.oregoom.mensajes;

import java.sql.*;

public class SelectMysql {

    public static void main(String[] args) throws SQLException {
        listarRegistros();
    }

    static void listarRegistros() throws SQLException {
        Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC",
                "root", "12345678");

        System.out.println("Conexion Exitosa");

        String sql = "SELECT * FROM mensajes";
        //Enviar Consulta
        PreparedStatement ps = conectar.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id_mensaje");
            String mensaje = rs.getString("mensaje");
            String autor = rs.getString("autor");
            String fecha = rs.getString("fecha");

            System.out.printf("%d %s %s %s\n", id, mensaje, autor, fecha);
        }
        rs.close();
        ps.close();
        conectar.close();
    }
}
