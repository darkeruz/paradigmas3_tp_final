/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darke.tpfinalagenda.logicaNegocio.controladores;

import com.darke.tpfinalagenda.logicaNegocio.objetos.TipoEvento;
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
public class TipoEventoControlador implements IBaseControlador<TipoEvento, Integer> {

    @Override
    public ArrayList<TipoEvento> extraerTodos() {
        String sql = "SELECT * FROM public.tipoevento;";
        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(sql);
            ArrayList<TipoEvento> listadoTipoEvento = new ArrayList<>();
            while(rs.next()){
                TipoEvento tipoEvento = new TipoEvento();
                tipoEvento.setNombre(rs.getString("nombre"));
                tipoEvento.setEstado(rs.getBoolean("estado"));
                listadoTipoEvento.add(tipoEvento);
            }
            return listadoTipoEvento;

        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    public Set<String> extraerDatos(int id) {
        String sql = "SELECT nombre, estado FROM tipoevento, agenda WHERE tipoevento_id_agenda = "+id;
        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(sql);
            Set<String> datosTipoEventos = new HashSet<>();
            while(rs.next()){
                datosTipoEventos.add(rs.getString("nombre"));
                datosTipoEventos.add(rs.getString("estado"));
                
            }
            return datosTipoEventos;

        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }

    @Override
    public boolean crear(TipoEvento objeto) {
        String sql = "INSERT INTO public.tipoevento (nombre, estado, tipoevento_id_agenda) VALUES (?, ?, ?)";
        
        try {
            Connection conn = ConexionDB.conectar();

            PreparedStatement prepareStatement = conn.prepareStatement(sql);
            prepareStatement.setString(1, objeto.getNombre());
            prepareStatement.setBoolean(2, objeto.isEstado());
            prepareStatement.setInt(3, objeto.getId_agenda());
            prepareStatement.executeUpdate();
            conn.close();
        } catch (SQLException e){
            System.out.println(e);
        }

        return true;
    }

    @Override
    public boolean modificar(TipoEvento objeto) {
        String sql = "UPDATE public.tipoevento SET nombre='"+objeto.getNombre()+"', estado='"+objeto.isEstado()+"' WHERE tipoevento_id_agenda="+objeto.getId()+";";

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
    public boolean eliminar(TipoEvento objeto) {
        String sql = "DELETE FROM public.tipoevento WHERE id_tipoevento="+objeto.getId()+";";
        
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
        String sql = "DELETE FROM public.tipoevento WHERE tipoevento_id_agenda="+id_agenda;
        
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
    public TipoEvento extraer(Integer id) {
        String sql = "SELECT * FROM public.tipoevento WHERE id_tipoevento="+id+";";
        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();
            
            ResultSet rs = statement.executeQuery(sql);
            
            while(rs.next()){
                TipoEvento tipoEvento = new TipoEvento();
                tipoEvento.setNombre(rs.getString("nombre"));
                tipoEvento.setEstado(rs.getBoolean("estado"));
                return tipoEvento;
            }

        }catch(SQLException e){
            System.out.println(e);
         }
        return null;
    }
    
}
