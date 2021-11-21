/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darke.tpfinalagenda.logicaNegocio.controladores;

import com.darke.tpfinalagenda.logicaNegocio.objetos.Persona;
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
public class PersonaControlador implements IBaseControlador<Persona, Integer> {

    @Override
    public ArrayList<Persona> extraerTodos() {
        String sql = "SELECT * FROM public.persona;";
        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(sql);
            ArrayList<Persona> listadoInvitados = new ArrayList<>();
            while(rs.next()){
                Persona invitado = new Persona();
                invitado.setApellido(rs.getString("apellido"));
                invitado.setNombre(rs.getString("nombre"));
                invitado.setId(rs.getInt("id_persona"));
                listadoInvitados.add(invitado);
            }
            conn.close();
            return listadoInvitados;
            
            

        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    public ArrayList<String> extraerApellidos(int id) {
        String sql = "SELECT id_persona, apellido, nombre FROM persona, agenda WHERE agenda_id_agenda = agenda.id_agenda AND agenda.id_agenda = "+id;
        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(sql);
            ArrayList<String> listadoInvitados = new ArrayList<>();
            while(rs.next()){
                listadoInvitados.add(rs.getString("apellido"));
                
            }
            conn.close();
            return listadoInvitados;

        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }

    @Override
    public boolean crear(Persona objeto) {
        String sql = "INSERT INTO public.persona (apellido, nombre, agenda_id_agenda) VALUES (?, ?, ?)";
        
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
    public boolean modificar(Persona objeto) {
        String sql = "UPDATE public.persona SET apellido='"+objeto.getApellido()+"', nombre='"+objeto.getNombre()+"' WHERE id_persona="+objeto.getId()+";";

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
    public boolean eliminar(Persona objeto) {
        String sql = "DELETE FROM public.persona WHERE id_persona="+objeto.getId()+";";
        
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
        String sql = "DELETE FROM public.persona WHERE agenda_id_agenda = "+id_agenda;
        
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
    public Persona extraer(Integer id) {
         String sql = "SELECT * FROM public.persona WHERE id_persona="+id+";";
        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();
            
            ResultSet rs = statement.executeQuery(sql);
            
            while(rs.next()){
                Persona invitado = new Persona();
                invitado.setApellido(rs.getString("apellido"));
                invitado.setNombre(rs.getString("nombre"));
                invitado.setId(rs.getInt("id_persona"));
                
                return invitado;
            }
            conn.close();

        }catch(SQLException e){
            System.out.println(e);
         }
        return null;
    }
    
}
