/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darke.tpfinalagenda.logicaNegocio.controladores;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author darke
 */
public class ConexionDB {
    private static Connection conexion = null;
    private static final String user = "postgres";
    private static final String password = ""; //Ingresar Contraseña de postgresql 
    private static final String conexionString = "jdbc:postgresql://localhost:5432/NOMBRE_DB"; //Reemplazar "NOMBRE_DB" por el nombre de tu base de datos.
    
    public static Connection conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(conexionString, user, password);
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return conexion;
    }
    
    
}