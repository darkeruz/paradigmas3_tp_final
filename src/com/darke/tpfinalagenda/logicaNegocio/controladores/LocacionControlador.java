/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darke.tpfinalagenda.logicaNegocio.controladores;

import com.darke.tpfinalagenda.logicaNegocio.objetos.Locacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author darke
 */
public class LocacionControlador implements IBaseControlador<Locacion, Integer> {

    @Override
    public ArrayList<Locacion> extraerTodos() {
        String sql = "SELECT * FROM public.locacion;";
        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(sql);
            ArrayList<Locacion> listadoLocacion = new ArrayList<>();
            while(rs.next()){
                Locacion locacion = new Locacion();
                locacion.setNombre(rs.getString("nombre"));
                locacion.setDomicilio(rs.getString("domicilio"));
                locacion.setEstado(rs.getBoolean("estado"));
                listadoLocacion.add(locacion);
            }
            return listadoLocacion;

        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    public Set<String> extraerDatos(int id) {
        String sql = "SELECT nombre, domicilio, estado FROM locacion, agenda WHERE locacion_id_agenda = "+id;
        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(sql);
            Set<String> datosLocacion = new HashSet<>();
            while(rs.next()){
                datosLocacion.add(rs.getString("nombre"));
                datosLocacion.add(rs.getString("domicilio"));
                datosLocacion.add(rs.getString("estado"));
            }
            return datosLocacion;

        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }

    @Override
    public boolean crear(Locacion objeto) {
        String sql = "INSERT INTO public.locacion (nombre, domicilio, estado, locacion_id_agenda) VALUES (?, ?, ?, ?)";
        
        try {
            Connection conn = ConexionDB.conectar();

            PreparedStatement prepareStatement = conn.prepareStatement(sql);
            prepareStatement.setString(1, objeto.getNombre());
            prepareStatement.setString(2, objeto.getDomicilio());
            prepareStatement.setBoolean(3, objeto.isEstado());
            prepareStatement.setInt(4, objeto.getId_agenda());
            prepareStatement.executeUpdate();
            conn.close();
        } catch (SQLException e){
            System.out.println(e);
        }

        return true;
    }

    @Override
    public boolean modificar(Locacion objeto) {
        String sql = "UPDATE public.locacion SET nombre='"+objeto.getNombre()+"', domicilio='"+objeto.getDomicilio()+"', estado='"+objeto.isEstado()+"' WHERE locacion_id_agenda="+objeto.getId()+";";

        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();
            statement.execute(sql);
            conn.close();
            return true;

        }catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }

    @Override
    public boolean eliminar(Locacion objeto) {
        String sql = "DELETE FROM public.locacion WHERE id_locacion="+objeto.getId()+";";
        
        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();            
            statement.executeQuery(sql);
            conn.close();
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return false;
    }
    
    public boolean eliminarPorId(int id_agenda) {
        String sql = "DELETE FROM public.locacion WHERE locacion_id_agenda="+id_agenda;
        
        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();            
            statement.executeQuery(sql);
            conn.close();
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return false;
    }

    @Override
    public Locacion extraer(Integer id) {
        String sql = "SELECT * FROM public.agenda WHERE id_locacion="+id+";";
        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();
            
            ResultSet rs = statement.executeQuery(sql);
            
            while(rs.next()){
                Locacion locacion = new Locacion();
                locacion.setNombre(rs.getString("nombre"));
                locacion.setDomicilio(rs.getString("domicilio"));
                locacion.setEstado(rs.getBoolean("estado"));
                return locacion;
            }

        }catch(SQLException e){
            System.out.println(e);
         }
        return null;
    }
    
}
