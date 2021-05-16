package com.company;

import java.io.IOException;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Main oracle = new Main();
        oracle.select();
    }
    public void select() {
        try {
            String query;

            Connection conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl", "SALVA", "1144");

            /*CREATE*/
//            query = "insert into EMPLEADOS(DOCUMENTO, APELLIDO, NOMBRE, SECCION)" +
//                    "VALUES('243', 'STALIN', 'KAISER', 'DICTADOR')";
//            Statement st = conn.createStatement();
//
//            st.executeUpdate(query);

            /*READ*/

            /*consulta con where*/
            //String query = "Select * from EMPLEADOS where documento = ?";
            /*tomar todos los valores*/
            //query = "Select * from EMPLEADOS";

            //PreparedStatement st = conn.prepareStatement(query);

            //String documento = readEntry("Introduza un ID del Documento: ");
            /*Se usa con el Where para ingresar valores por consola*/

/*             st.clearParameters();
             st.setString(1, documento);*/

/*            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String Documento = rs.getString("DOCUMENTO");
                String Apellido = rs.getString("APELLIDO");
                String Nombre = rs.getString("NOMBRE");
                String Seccion = rs.getString("SECCION");

                System.out.println("Id del documento:  "
                        + Documento + " -- Apellido:  "
                        + Apellido + " -- Nombre  "
                        + Nombre + " -- Seccion  "
                        + Seccion);
            }*/

            /*UPDATE*/

            /*query = "UPDATE EMPLEADOS SET SECCION = 'SOCIALISTA' WHERE DOCUMENTO = 243";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            System.out.println("Base de datos modificada");*/

            /*DELETE*/

            /*query = "DELETE FROM EMPLEADOS WHERE DOCUMENTO = 22333444";
            PreparedStatement st = conn.prepareStatement(query);
            st.executeUpdate();
            System.out.println("Eliminacion Correcta");*/

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    /*Funcion para leer datos desde consola*/
    static String readEntry(String prompt) {
        try {
            StringBuffer buffer = new StringBuffer();
            System.out.print(prompt);
            System.out.flush();
            int c = System.in.read();
            while (c != '\n' && c != -1) {
                buffer.append((char) c);
                c = System.in.read();
            }
            return buffer.toString().trim();
        } catch (IOException e) {
            return "Error ReadEntry" + e;
        }
    }
}
