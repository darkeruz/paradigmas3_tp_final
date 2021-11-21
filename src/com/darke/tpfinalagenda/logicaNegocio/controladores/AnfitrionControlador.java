/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darke.tpfinalagenda.logicaNegocio.controladores;

import com.darke.tpfinalagenda.logicaNegocio.objetos.Anfitrion;
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
public class AnfitrionControlador implements IBaseControlador<Anfitrion, Integer>{

    @Override
    public ArrayList<Anfitrion> extraerTodos() {
        String sql = "SELECT * FROM public.anfitrion;";
        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(sql);
            ArrayList<Anfitrion> listadoAnfitrion = new ArrayList<>();
            while(rs.next()){
                Anfitrion anfitrion = new Anfitrion();
                anfitrion.setId(rs.getInt("id_anfitrion"));
                anfitrion.setApellido(rs.getString("apellido"));
                anfitrion.setNombre(rs.getString("nombre"));
                listadoAnfitrion.add(anfitrion);
            }
            return listadoAnfitrion;

        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    public ArrayList<String> extraerApellidos(int id) {
        String sql = "SELECT id_anfitrion, apellido, nombre FROM anfitrion, agenda WHERE agenda_id_agenda = agenda.id_agenda AND agenda.id_agenda = "+id;
        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(sql);
            ArrayList<String> listadoAnfitrion = new ArrayList<>();
            while(rs.next()){
                listadoAnfitrion.add(rs.getString("apellido"));
                
            }
            return listadoAnfitrion;

        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    public ArrayList<Anfitrion> extraerTodosPersonalizado(int id) {
        String sql = "SELECT id_anfitrion, apellido, nombre FROM anfitrion, agenda WHERE agenda_id_agenda = agenda.id_agenda AND agenda.id_agenda = "+id;
        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(sql);
            ArrayList<Anfitrion> listadoAnfitrion = new ArrayList<>();
            while(rs.next()){
                Anfitrion anfitrion = new Anfitrion();
                anfitrion.setId(rs.getInt("id_anfitrion"));
                anfitrion.setApellido(rs.getString("apellido"));
                anfitrion.setNombre(rs.getString("nombre"));
                listadoAnfitrion.add(anfitrion);
            }
            return listadoAnfitrion;

        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }

    @Override
    public boolean crear(Anfitrion objeto) {
        String sql = "INSERT INTO public.anfitrion (apellido, nombre, agenda_id_agenda) VALUES (?, ?, ?)";
        
        try {
            Connection conn = ConexionDB.conectar();

            PreparedStatement prepareStatement = conn.prepareStatement(sql);
            prepareStatement.setString(1, objeto.getApellido());
            prepareStatement.setString(2, objeto.getNombre());
            prepareStatement.setInt(3, objeto.getId_agenda());
            prepareStatement.executeUpdate();
            conn.close();
        } catch (SQLException e){
            System.out.println(e);
        }

        return true;
    }

    @Override
    public boolean modificar(Anfitrion objeto) {
        String sql = "UPDATE public.anfitrion SET apellido='"+objeto.getApellido()+"', nombre='"+objeto.getNombre()+"' WHERE id_anfitrion="+objeto.getId()+";";

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
    public boolean eliminar(Anfitrion objeto) {
        String sql = "DELETE FROM public.anfitrion WHERE id_anfitrion="+objeto.getId()+";";
        
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
    
    public boolean eliminarTodo(int id_agenda) {
        String sql = "DELETE FROM public.anfitrion WHERE agenda_id_agenda = "+id_agenda;
        
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
    public Anfitrion extraer(Integer id) {
        String sql = "SELECT * FROM public.anfitrion WHERE id_anfitrion="+id+";";
        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();
            
            ResultSet rs = statement.executeQuery(sql);
            
            while(rs.next()){
                Anfitrion anfitrion = new Anfitrion();
                anfitrion.setApellido(rs.getString("apellido"));
                anfitrion.setNombre(rs.getString("nombre"));
                
                return anfitrion;
            }

        }catch(SQLException e){
            System.out.println(e);
         }
        return null;
    }
    
}
